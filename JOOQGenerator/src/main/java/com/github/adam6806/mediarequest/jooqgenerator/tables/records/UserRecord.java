/**
 * This class is generated by jOOQ
 */
package com.github.adam6806.mediarequest.jooqgenerator.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends org.jooq.impl.UpdatableRecordImpl<com.github.adam6806.mediarequest.jooqgenerator.tables.records.UserRecord> implements org.jooq.Record7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.sql.Date, java.lang.Integer> {

	private static final long serialVersionUID = -1909966019;

	/**
	 * Setter for <code>request.user.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>request.user.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>request.user.firstName</code>.
	 */
	public void setFirstname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>request.user.firstName</code>.
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>request.user.lastName</code>.
	 */
	public void setLastname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>request.user.lastName</code>.
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>request.user.type</code>.
	 */
	public void setType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>request.user.type</code>.
	 */
	public java.lang.String getType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>request.user.joinDate</code>.
	 */
	public void setJoindate(java.sql.Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>request.user.joinDate</code>.
	 */
	public java.sql.Date getJoindate() {
		return (java.sql.Date) getValue(4);
	}

	/**
	 * Setter for <code>request.user.lastLogin</code>.
	 */
	public void setLastlogin(java.sql.Date value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>request.user.lastLogin</code>.
	 */
	public java.sql.Date getLastlogin() {
		return (java.sql.Date) getValue(5);
	}

	/**
	 * Setter for <code>request.user.numberOfRequests</code>.
	 */
	public void setNumberofrequests(java.lang.Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>request.user.numberOfRequests</code>.
	 */
	public java.lang.Integer getNumberofrequests() {
		return (java.lang.Integer) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.sql.Date, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Date, java.sql.Date, java.lang.Integer> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field5() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.JOINDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field6() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.LASTLOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field7() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER.NUMBEROFREQUESTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value5() {
		return getJoindate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value6() {
		return getLastlogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value7() {
		return getNumberofrequests();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(java.lang.String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(java.lang.String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value4(java.lang.String value) {
		setType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value5(java.sql.Date value) {
		setJoindate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value6(java.sql.Date value) {
		setLastlogin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value7(java.lang.Integer value) {
		setNumberofrequests(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.sql.Date value5, java.sql.Date value6, java.lang.Integer value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(java.lang.String email, java.lang.String firstname, java.lang.String lastname, java.lang.String type, java.sql.Date joindate, java.sql.Date lastlogin, java.lang.Integer numberofrequests) {
		super(com.github.adam6806.mediarequest.jooqgenerator.tables.User.USER);

		setValue(0, email);
		setValue(1, firstname);
		setValue(2, lastname);
		setValue(3, type);
		setValue(4, joindate);
		setValue(5, lastlogin);
		setValue(6, numberofrequests);
	}
}
