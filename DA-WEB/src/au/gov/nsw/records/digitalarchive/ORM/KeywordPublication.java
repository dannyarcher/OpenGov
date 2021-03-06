package au.gov.nsw.records.digitalarchive.ORM;
// default package
// Generated 31/07/2012 1:57:01 PM by Hibernate Tools 3.4.0.CR1

/**
 * KeywordPublication generated by hbm2java
 */
public class KeywordPublication implements java.io.Serializable {

	private Integer keyPubId;
	private Publication publication;
	private Keyword keyword;

	public KeywordPublication() {
	}

	public KeywordPublication(Publication publication, Keyword keyword) {
		this.publication = publication;
		this.keyword = keyword;
	}

	public Integer getKeyPubId() {
		return this.keyPubId;
	}

	public void setKeyPubId(Integer keyPubId) {
		this.keyPubId = keyPubId;
	}

	public Publication getPublication() {
		return this.publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

	public Keyword getKeyword() {
		return this.keyword;
	}

	public void setKeyword(Keyword keyword) {
		this.keyword = keyword;
	}

}
