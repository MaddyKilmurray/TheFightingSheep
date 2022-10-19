package com.sparta.thefightingsheep.model.dao;


import com.sparta.thefightingsheep.model.dto.Dto;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object.<br>
 * Used for abstracting database CRUD (create, read, update, delete) operations.
 * @param <T> The Data Transfer Object type
 */
public interface Dao<T extends Dto> {
    /**
     * Inserts a new item to the database.
     * @param item the item to be inserted
     * @return the {@code id} of the inserted item if added successfully<br>
     * {@code null} if not
     */
    String insert(T item);

    /**
     * Fetch an item from the database with a specified {@code id}.
     * @param id the {@code id} of the item
     * @return the result
     */
    Optional<T> findById(String id);

    /**
     * Fetch all items from the database.
     * @return a {@code List} of found items
     */
    List<T> findAll();

    /**
     * Updates an item in a database.
     * If the {@code id} specified in the item doesn't exist, <br>
     * then the item will not be updated.
     * @param item the updated item
     * @return {@code true} if updated successfully<br>
     * {@code false} if not
     */
    boolean update(T item);

    /**
     * Deletes an item in the database.
     * @param item the item to be deleted
     * @return the {@code id} of the deleted item if deleted successfully<br>
     * {@code null} if not
     */
    String delete(T item);

    /**
     * Deletes all items in the database.
     * @return {@code true} if deleted<br>
     * {@code false} if not
     */
    boolean deleteAll();
}
