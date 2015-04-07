/**
 * This class is generated by jOOQ
 */
package com.github.adam6806.mediarequest.jooqgenerator.tables;

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
public class Request extends org.jooq.impl.TableImpl<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord> {

	private static final long serialVersionUID = 1522464286;

	/**
	 * The reference instance of <code>request.request</code>
	 */
	public static final com.github.adam6806.mediarequest.jooqgenerator.tables.Request REQUEST = new com.github.adam6806.mediarequest.jooqgenerator.tables.Request();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord> getRecordType() {
		return com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord.class;
	}

	/**
	 * The column <code>request.request.email</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>request.request.mediaId</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.String> MEDIAID = createField("mediaId", org.jooq.impl.SQLDataType.VARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>request.request.isMovie</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.Boolean> ISMOVIE = createField("isMovie", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>request.request.posterImageUrl</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.String> POSTERIMAGEURL = createField("posterImageUrl", org.jooq.impl.SQLDataType.VARCHAR.length(512), this, "");

	/**
	 * The column <code>request.request.description</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>request.request.requestDate</code>.
	 */
	public final org.jooq.TableField<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord, java.lang.String> REQUESTDATE = createField("requestDate", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * Create a <code>request.request</code> table reference
	 */
	public Request() {
		this("request", null);
	}

	/**
	 * Create an aliased <code>request.request</code> table reference
	 */
	public Request(java.lang.String alias) {
		this(alias, com.github.adam6806.mediarequest.jooqgenerator.tables.Request.REQUEST);
	}

	private Request(java.lang.String alias, org.jooq.Table<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord> aliased) {
		this(alias, aliased, null);
	}

	private Request(java.lang.String alias, org.jooq.Table<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.github.adam6806.mediarequest.jooqgenerator.Request.REQUEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord> getPrimaryKey() {
		return com.github.adam6806.mediarequest.jooqgenerator.Keys.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.github.adam6806.mediarequest.jooqgenerator.tables.records.RequestRecord>>asList(com.github.adam6806.mediarequest.jooqgenerator.Keys.KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.github.adam6806.mediarequest.jooqgenerator.tables.Request as(java.lang.String alias) {
		return new com.github.adam6806.mediarequest.jooqgenerator.tables.Request(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.github.adam6806.mediarequest.jooqgenerator.tables.Request rename(java.lang.String name) {
		return new com.github.adam6806.mediarequest.jooqgenerator.tables.Request(name, null);
	}
}
