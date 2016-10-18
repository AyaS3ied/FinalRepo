/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package j2se.xe.github.dao;

import j2se.xe.github.dto.*;
import j2se.xe.github.exceptions.*;

public interface UsersDao
{
	/** 
	 * Inserts a new row in the USERS table.
	 */
	public UsersPk insert(Users dto) throws UsersDaoException;

	/** 
	 * Updates a single row in the USERS table.
	 */
	public void update(UsersPk pk, Users dto) throws UsersDaoException;

	/** 
	 * Deletes a single row in the USERS table.
	 */
	public void delete(UsersPk pk) throws UsersDaoException;

	/** 
	 * Returns the rows from the USERS table that matches the specified primary-key value.
	 */
	public Users findByPrimaryKey(UsersPk pk) throws UsersDaoException;

	/** 
	 * Returns all rows from the USERS table that match the criteria 'USER_NAME = :userName AND PASSWORD = :password'.
	 */
	public Users findByPrimaryKey(String userName, String password) throws UsersDaoException;

	/** 
	 * Returns all rows from the USERS table that match the criteria ''.
	 */
	public Users[] findAll() throws UsersDaoException;

	/** 
	 * Returns all rows from the USERS table that match the criteria 'USER_NAME = :userName'.
	 */
	public Users[] findWhereUserNameEquals(String userName) throws UsersDaoException;

	/** 
	 * Returns all rows from the USERS table that match the criteria 'PASSWORD = :password'.
	 */
	public Users[] findWherePasswordEquals(String password) throws UsersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the USERS table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicSelect(String sql, Object[] sqlParams) throws UsersDaoException;

	/** 
	 * Returns all rows from the USERS table that match the specified arbitrary SQL statement
	 */
	public Users[] findByDynamicWhere(String sql, Object[] sqlParams) throws UsersDaoException;

}
