# TheFightingSheep

![Project_Structure](https://user-images.githubusercontent.com/66964622/196206614-10851eee-6680-4a25-a54e-5195750d5ad5.png)


## MongoDB setup
- Load the sample database
- Set your user permissions to admin
- Create `showings` collection in `sample_mflix`
- Add the following validations rules for the following collections
  + `comments`:
  + `movies`:
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
