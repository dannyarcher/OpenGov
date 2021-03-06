package au.gov.nsw.records.digitalarchive.ORM;
// default package
// Generated 08/02/2013 2:17:12 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Publication generated by hbm2java
 */
public class Publication implements java.io.Serializable {

	private Integer publicationId;
	private Member member;
	private Archivist archivist;
	private String title;
	private String description;
	private String datePublishedRaw;
	private String datePublishedDisplay;
	private String type;
	private String typeOther;
	private String coverage;
	private String language;
	private String rights;
	private String creativeCommons;
	private String totalPages;
	private String totalFiles;
	private String status;
	private Double popularity;
	private Integer viewedTimes;
	private Date lastViewed;
	private Date lastUpdated;
	private Date dateRegistered;
	private Date dateApproved;
	private Set<UploadedFile> uploadedFiles = new HashSet<UploadedFile>(0);
	private Set<KeywordPublication> keywordPublications = new HashSet<KeywordPublication>(
			0);
	private Set<PublisherPublication> publisherPublications = new HashSet<PublisherPublication>(
			0);
	private Set<AgencyPublication> agencyPublications = new HashSet<AgencyPublication>(
			0);

	public Publication() {
	}

	public Publication(Member member, Archivist archivist, String title,
			String description, String dataPublishedRaw,
			String datePublishedDisplay, String type, String typeOther,
			String coverage, String language, String rights,
			String creativeCommons, String totalPages, String totalFiles,
			String status, Double popularity, Integer viewedTimes,
			Date lastViewed, Date lastUpdated, Date dateRegistered,
			Date dateApproved, Set<UploadedFile> uploadedFiles,
			Set<KeywordPublication> keywordPublications,
			Set<PublisherPublication> publisherPublications,
			Set<AgencyPublication> agencyPublications) {
		this.member = member;
		this.archivist = archivist;
		this.title = title;
		this.description = description;
		this.datePublishedRaw = dataPublishedRaw;
		this.datePublishedDisplay = datePublishedDisplay;
		this.type = type;
		this.typeOther = typeOther;
		this.coverage = coverage;
		this.language = language;
		this.rights = rights;
		this.creativeCommons = creativeCommons;
		this.totalPages = totalPages;
		this.totalFiles = totalFiles;
		this.status = status;
		this.popularity = popularity;
		this.viewedTimes = viewedTimes;
		this.lastViewed = lastViewed;
		this.lastUpdated = lastUpdated;
		this.dateRegistered = dateRegistered;
		this.dateApproved = dateApproved;
		this.uploadedFiles = uploadedFiles;
		this.keywordPublications = keywordPublications;
		this.publisherPublications = publisherPublications;
		this.agencyPublications = agencyPublications;
	}

	public Integer getPublicationId() {
		return this.publicationId;
	}

	public void setPublicationId(Integer publicationId) {
		this.publicationId = publicationId;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Archivist getArchivist() {
		return this.archivist;
	}

	public void setArchivist(Archivist archivist) {
		this.archivist = archivist;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDatePublishedRaw() {
		return this.datePublishedRaw;
	}

	public void setDatePublishedRaw(String datePublishedRaw) {
		this.datePublishedRaw = datePublishedRaw;
	}

	public String getDatePublishedDisplay() {
		return this.datePublishedDisplay;
	}

	public void setDatePublishedDisplay(String datePublishedDisplay) {
		this.datePublishedDisplay = datePublishedDisplay;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeOther() {
		return this.typeOther;
	}

	public void setTypeOther(String typeOther) {
		this.typeOther = typeOther;
	}

	public String getCoverage() {
		return this.coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getRights() {
		return this.rights;
	}

	public void setRights(String rights) {
		this.rights = rights;
	}

	public String getCreativeCommons() {
		return this.creativeCommons;
	}

	public void setCreativeCommons(String creativeCommons) {
		this.creativeCommons = creativeCommons;
	}

	public String getTotalPages() {
		return this.totalPages;
	}

	public void setTotalPages(String totalPages) {
		this.totalPages = totalPages;
	}

	public String getTotalFiles() {
		return this.totalFiles;
	}

	public void setTotalFiles(String totalFiles) {
		this.totalFiles = totalFiles;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	public Integer getViewedTimes() {
		return this.viewedTimes;
	}

	public void setViewedTimes(Integer viewedTimes) {
		this.viewedTimes = viewedTimes;
	}

	public Date getLastViewed() {
		return this.lastViewed;
	}

	public void setLastViewed(Date lastViewed) {
		this.lastViewed = lastViewed;
	}

	public Date getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Date getDateRegistered() {
		return this.dateRegistered;
	}

	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public Date getDateApproved() {
		return this.dateApproved;
	}

	public void setDateApproved(Date dateApproved) {
		this.dateApproved = dateApproved;
	}

	public Set<UploadedFile> getUploadedFiles() {
		return this.uploadedFiles;
	}

	public void setUploadedFiles(Set<UploadedFile> uploadedFiles) {
		this.uploadedFiles = uploadedFiles;
	}

	public Set<KeywordPublication> getKeywordPublications() {
		return this.keywordPublications;
	}

	public void setKeywordPublications(
			Set<KeywordPublication> keywordPublications) {
		this.keywordPublications = keywordPublications;
	}

	public Set<PublisherPublication> getPublisherPublications() {
		return this.publisherPublications;
	}

	public void setPublisherPublications(
			Set<PublisherPublication> publisherPublications) {
		this.publisherPublications = publisherPublications;
	}

	public Set<AgencyPublication> getAgencyPublications() {
		return this.agencyPublications;
	}

	public void setAgencyPublications(Set<AgencyPublication> agencyPublications) {
		this.agencyPublications = agencyPublications;
	}

}
