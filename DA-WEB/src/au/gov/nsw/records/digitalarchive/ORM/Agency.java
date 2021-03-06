package au.gov.nsw.records.digitalarchive.ORM;

/**
 * Agency generated by hbm2java
 */
public class Agency implements java.io.Serializable {

	private Integer agencyId;
	private TempList tempList;
	private BosList bosList;

	public Agency() {
	}

	public Agency(TempList tempList, BosList bosList) {
		this.tempList = tempList;
		this.bosList = bosList;
	}

	public Integer getAgencyId() {
		return this.agencyId;
	}

	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}

	public TempList getTempList() {
		return this.tempList;
	}

	public void setTempList(TempList tempList) {
		this.tempList = tempList;
	}

	public BosList getBosList() {
		return this.bosList;
	}

	public void setBosList(BosList bosList) {
		this.bosList = bosList;
	}

}
