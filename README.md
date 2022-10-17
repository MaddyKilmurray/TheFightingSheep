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
        awards: {enum: ['']},
        cast: {},
        countries: {},
        directors: {},
        fullplot: {},
        genres: {},
        imdb: {},
        lastupdated: {},
        num_mflix_comments: {},
        plot: {},
        rated: {},
        runtime: {},
        title: {},
        tomatoes: {},
        type: {},
        year: {},
        languages: {},
        poster: {},
        writers: {}
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
