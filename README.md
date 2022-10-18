# TheFightingSheep

![Project_Structure](https://user-images.githubusercontent.com/66964622/196206614-10851eee-6680-4a25-a54e-5195750d5ad5.png)


## MongoDB setup
- Load the sample database
- Set your user permissions to admin
- Create `showings` collection in `sample_mflix`
- Add the following validations rules for the following collections
  + `comments`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "date", "email", "movie_id", "name", "text"],
      properties: {
        _id: { bsonType: "objectId" },
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
        lastupdated: { bsonType: "string" },
        num_mflix_comments: { bsonType: "int" },
        plot: { bsonType: "string" },
        rated: { enum: ["AO", "APPROVED", "Approved", "G", "GP", "M", "NC-17", "NOT RATED", "Not Rated", "OPEN", "PASSED", "PG", "PG-13", "R", "TV-14", "TV-G", "TV-MA", "TV-PG", "TV-Y7", "UNRATED", "X"] },
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
            lastupdated: { bsonType: "date"  },
            production: { bsonType: "string" },
            rotten: { bsonType: "int" },
            viewer: { bsonType: "object", required: ["numReviews"], properties: { meter: { bsonType: "int" }, numReviews: { bsonType: "int" }, rating: { bsonType: "double" } } },
            website: { bsonType: "string" }
          }
        },
        type: { bsonType: "string" },
        year: { anyOf: [{ bsonType: "int" }] },
        languages: { bsonType: "array", items: { bsonType: "string" } },
        poster: { bsonType: "string" },
        writers: { bsonType: "array", items: { bsonType: "string" } }
      }
    }
  }
  ```
  + `showings`:
  ```js
  {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "showing_date", "movie", "theatre"],
      properties: {
        _id: { bsonType: "objectId" },
        showing_date: { bsonType: "date" },
        movie: {
          bsonType: "object",
          required: ["$ref", "$id"],
          properties: { $ref: { enum: ["movies"] }, $id: { bsonType: "objectId" } }
        },
        theatre: {
          bsonType: "object",
          required: ["$ref", "$id"],
          properties: { $ref: { enum: ["theatres"] }, $id: { bsonType: "objectId" } }
        },
      }
    }
  }
  ```
  + `theatres`:
  + `users`:
- Run the following commands in `mongosh` for the following categories
  + `movies`:
  ```js
  > use sample_mflix
  > var schema = {
    $jsonSchema: {
      bsonType: "object",
      required: ["_id", "awards", "imdb", "lastupdated", "num_mflix_comments", "title", "type", "year"],
      properties: {
        _id: { bsonType: "objectId" },
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
        lastupdated: { bsonType: "string" },
        num_mflix_comments: { bsonType: "int" },
        plot: { bsonType: "string" },
        rated: { enum: ["AO", "APPROVED", "Approved", "G", "GP", "M", "NC-17", "NOT RATED", "Not Rated", "OPEN", "PASSED", "PG", "PG-13", "R", "TV-14", "TV-G", "TV-MA", "TV-PG", "TV-Y7", "UNRATED", "X"] },
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
            lastupdated: { bsonType: "date"  },
            production: { bsonType: "string" },
            rotten: { bsonType: "int" },
            viewer: { bsonType: "object", required: ["numReviews"], properties: { meter: { bsonType: "int" }, numReviews: { bsonType: "int" }, rating: { bsonType: "double" } } },
            website: { bsonType: "string" }
          }
        },
        type: { bsonType: "string" },
        year: { anyOf: [{ bsonType: "int" }] },
        languages: { bsonType: "array", items: { bsonType: "string" } },
        poster: { bsonType: "string" },
        writers: { bsonType: "array", items: { bsonType: "string" } }
      }
    }
  }
  > db.movies.updateMany({},{$unset:{"imdb.rating":"","imdb.votes":""}},{})
  > db.movies.deleteMany({$nor:[schema]})
  ```
  + `theatres`:
  + `users`:
