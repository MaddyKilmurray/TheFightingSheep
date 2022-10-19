# TheFightingSheep

![Project_Structure](https://user-images.githubusercontent.com/66964622/196206614-10851eee-6680-4a25-a54e-5195750d5ad5.png)


## MongoDB setup
- Load the sample database
- Set your user permissions to admin
- Create `authorisedusers`, `roles` and `showings` collections in `sample_mflix`
- Run the following commands in `mongosh`:
```js
> use sample_mflix
> (()=>{
	db.movies.updateMany({},{$unset:{"imdb.rating":"","imdb.votes":""}},{})
	db.movies.updateMany({"lastupdated":{"$type":"string"}},[{"$set":{"lastupdated":{"$dateFromString":{"dateString":"$lastupdated"}}}}])
	db.movies.updateMany({"rated":"Approved"},[{"$set":{"rated":"APPROVED"}}])
	db.movies.updateMany({"rated":"NC-17"},[{"$set":{"rated":"NC_17"}}])
	db.movies.updateMany({"rated":"NOT RATED"},[{"$set":{"rated":"NOT_RATED"}}])
	db.movies.updateMany({"rated":"Not Rated"},[{"$set":{"rated":"NOT_RATED"}}])
	db.movies.updateMany({"rated":"PG-13"},[{"$set":{"rated":"PG_13"}}])
	db.movies.updateMany({"rated":"TV-14"},[{"$set":{"rated":"TV_14"}}])
	db.movies.updateMany({"rated":"TV-G"},[{"$set":{"rated":"TV_G"}}])
	db.movies.updateMany({"rated":"TV-MA"},[{"$set":{"rated":"TV_MA"}}])
	db.movies.updateMany({"rated":"TV-PG"},[{"$set":{"rated":"TV_PG"}}])
	db.movies.updateMany({"rated":"TV-Y7"},[{"$set":{"rated":"TV_Y7"}}])
})()
```
- Add the following validations rules for the following collections
  + `authorisedusers`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "username", "password", "userRole"],
      properties: {
        _id: { bsonType: "objectId" },
        _class: { bsonType: "string" },
        username: { bsonType: "string" },
        password: { bsonType: "string" },
        userRole: {
          bsonType: "object",
          required: ["$ref", "$id"],
          properties: { $ref: { enum: ["roles"] }, $id: { bsonType: "objectId" } }
        }
      }
    }
  }
  ```
  + `comments`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "date", "email", "movie_id", "name", "text"],
      properties: {
        _id: { bsonType: "objectId" },
        _class: { bsonType: "string" },
        date: { bsonType: "date" },
        email: { bsonType: "string" },
        movie_id: { bsonType: "objectId" },
        name: { bsonType: "string" },
        text: { bsonType: "string" }
      }
    }
  }
  ```
  + `movies`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "awards", "imdb", "lastupdated", "num_mflix_comments", "title", "type", "year"],
      properties: {
        _id: { bsonType: "objectId" },
        _class: { bsonType: "string" },
        awards: {
          bsonType: "object",
          required: ["wins", "nominations", "text"],
          properties: { wins: { bsonType: "int" }, nominations: { bsonType: "int" }, text: { bsonType: "string" } }
        },
        cast: { bsonType: "array", items: { bsonType: "string" } },
        countries: { bsonType: "array", items: { bsonType: "string" } },
        directors: { bsonType: "array", items: { bsonType: "string" } },
        fullplot: { bsonType: "string"},
        genres: { bsonType: "array", items: { bsonType: "string" } },
        imdb: {
          bsonType: "object",
          required: ["id"],
          properties: { rating: { bsonType: "double" }, votes: { bsonType: "int" }, id: { bsonType: "int" } }
        },
        lastupdated: { bsonType: "date" },
        num_mflix_comments: { bsonType: "int" },
        plot: { bsonType: "string" },
        rated: { enum: ["AO", "APPROVED", "G", "GP", "M", "NC_17", "NOT_RATED", "OPEN", "PASSED", "PG", "PG_13", "R", "TV_14", "TV_G", "TV_MA", "TV_PG", "TV_Y7", "UNRATED", "X"] },
        runtime: { bsonType: "int" },
        title: { bsonType: "string" },
        tomatoes: {
          bsonType: "object",
          required: ["lastUpdated"],
          properties: {
            consensus: { bsonType: "string" },
            critic: { bsonType: "object", properties: { meter: { bsonType: "int" }, numReviews: { bsonType: "int" }, rating: { bsonType: "double" } } },
            dvd: { bsonType: "date" },
            fresh: { bsonType: "int" },
            lastUpdated: { bsonType: "date"  },
            production: { bsonType: "string" },
            rotten: { bsonType: "int" },
            viewer: { bsonType: "object", required: ["numReviews"], properties: { meter: { bsonType: "int" }, numReviews: { bsonType: "int" }, rating: { bsonType: "double" } } },
            website: { bsonType: "string" }
          }
        },
        type: { bsonType: "string" },
        year: { bsonType: "int" },
        languages: { bsonType: "array", items: { bsonType: "string" } },
        poster: { bsonType: "string" },
        writers: { bsonType: "array", items: { bsonType: "string" } }
      }
    }
  }
  ```
  + `roles`:
  ```js
  {
    $jsonSchema: {
      bsonType: 'object',
      required: ['_id','role',],
      properties: {
        _id: {bsonType: 'objectId'},
        _class: {bsonType: 'string'},
        role: { bsonType: "string" }
      }
    }
  }
  ```
  + `showings`:
  ```js
  {
    $jsonSchema: {
      bsonType: 'object',
      required: ['_id', 'showing_date', 'movie', 'theater'],
      properties: {
        _id: { bsonType: 'objectId' },
        _class: { bsonType: 'string' },
        showing_date: { bsonType: 'date' },
        movie: {
          bsonType: 'object',
          required: ['$ref', '$id'],
          properties: {
            $ref: { 'enum': ['movies'] },
            $id: { bsonType: 'objectId' }
          }
        },
        theater: {
          bsonType: 'object',
          required: ['$ref', '$id'],
          properties: {
            $ref: { 'enum': ['theaters'] },
            $id: { bsonType: 'objectId'}
          }
        }
      }
    }
  }
  ```
  + `theaters`:
  ```js
  {
    $jsonSchema: {
      bsonType: 'object',
      required: ['_id', 'theaterId', 'location'],
      properties: {
        _id: { bsonType: 'objectId' },
        _class: { bsonType: "string" },
        theaterId: { bsonType: 'int' },
        location: {
          bsonType: 'object',
          required: ['address', 'geo'],
          properties: {
            address: {
              bsonType: "object",
              required: ["city", "state", "street1", "zipcode"],
              properties: { city: { bsonType: "string" }, state: { bsonType: "string" }, street1: { bsonType: "string" }, zipcode: { bsonType: "string" } }
            },
            geo: {
              bsonType: "object",
              required: ["coordinates", "type"],
              properties: { coordinates: { bsonType: "array", items: [{ bsonType: "double" }, { bsonType: "double" }], additionalItems: false }, type: { enum: ["Point"] } }
            }
          }
        }
      }
    }
  }
  ```
  + `users`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "email", "name", "password"],
      properties: {
        _id: { bsonType: "objectId" },
        _class: { bsonType: "string" },
        email: { bsonType: "string" },
        name: { bsonType: "string" },
        password: { bsonType: "string" },
      }
    }
  }
  ```
- Run the following commands in `mongosh`:
```js
> use sample_mflix
> (()=>{
	db.roles.insertMany([{"role": "ADMIN"}, {"role": "USER"}],{})
	var schema = <replace this with movies schema>
	db.movies.deleteMany({$nor:[schema]})
})()
```

## POJO specifications for each collection
The following is the boilerplate-free outline for what each Entity POJO should look like. When actually implementing, add appropriate access modifiers, constructors, getters and setters, additional methods and annotations.

### The `authorisedusers` collection
```java
@Document(collection="authorisedusers")
class AuthorisedUser {
	@MongoId ObjectId id;
	String username;
	String password;
	@DBRef Role userRole;
}
```
### The `comments` collection
```java
@Document("comments")
class Comment {
	@MongoId ObjectId id;
	LocalDateTime date;
	String email;
	@Field("movie_id") ObjectId movieId;
	String name;
	String text;
}
```
### The `movies` collection
```java
@Document(collection="movies")
class Movie {
	@MongoId ObjectId id;
	Awards awards;
	@Nullable List<String> cast;
	@Nullable List<String> countries;
	@Nullable List<String> directors;
	@Nullable @Field("fullplot") String fullPlot;
	@Nullable List<String> genres;
	Imdb imdb;
	@Field("lastupdated") LocalDateTime lastUpdated;
	@Field("num_mflix_comments") Integer numMflixComments;
	@Nullable String plot;
	@Nullable @Field("rated") Rating rating;
	@Nullable Integer runtime;
	String title;
	@Nullable Tomatoes tomatoes;
	String type;
	Integer year;
	@Nullable List<String> languages;
	@Nullable String poster;
	@Nullable List<String> writers;
}

class Awards {
	Integer wins;
	Integer nominations;
	String text;
}

class Imdb {
	@Field("id") Integer id;
	@Nullable Double rating;
	@Nullable Integer votes;
}

enum Rating {
    AO,
    APPROVED,
    G,
    GP,
    M,
    NC_17,
    NOT_RATED,
    OPEN,
    PASSED,
    PG,
    PG_13,
    R,
    TV_14,
    TV_G,
    TV_MA,
    TV_PG,
    TV_Y7,
    UNRATED,
    X
}

class Tomatoes {
	@Nullable String consensus;
	@Nullable Critic critic;
	@Nullable LocalDateTime dvd;
	@Nullable Integer fresh;
	LocalDateTime lastUpdated;
	@Nullable String production;
	@Nullable Integer rotten;
	@Nullable Viewer viewer;
	@Nullable String website;
}

class Critic {
	@Nullable Integer meter;
	@Nullable Integer numReviews;
	@Nullable Double rating;
}

class Viewer {
	@Nullable Integer meter;
	Integer numReviews;
	@Nullable Double rating;
}
```
### The `roles` collection
```java
@Document(collection="roles")
class Role {
	@MongoId ObjectId id;
	String role;
}
```
### The `showings` collection
```java
@Document(collection="showings")
class Showing {
	@MongoId ObjectId id;
	@Field("showing_date") LocalDateTime showingDate;
	@DBRef Movie movie;
	@DBRef Theater theater;
}
```
### The `theaters` collection
```java
@Document(collection="theaters")
class Theater {
	@MongoId ObjectId id;
	Integer theaterId;
	Location location;
}

class Location {
	Address address;
	Geo geo;
}

class Address {
	String city;
	String state;
	@Field("street1") String streetOne;
	@Field("zipcode") String zipCode;
}

class Geo {
	List<Double> coordinates;
	final String type = "Point";
}
```
### The `users` collection
```java
@Document(collection="users")
class User {
	@MongoId ObjectId id;
	String email;
	String name;
	String password;
}
```
