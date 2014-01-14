//Class:        agency.java
//Description:  Allows you to store the information for a new agency being added 
//              to the database
//Author:       Jauan Davis
//Date:         9/13/2013
//*******************************************************************************

public class agency {
    private String name;
    private String street;
    private String city;
    private String agencyphone;
    private String website;
    private String contactperson;
    private String fax;
    private String email;
    private String missionstatement;
    private String eligibility;
    private String zip;
    private int agencyID;
     
    
    public agency(){
        
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAgencyphone() {
        return agencyphone;
    }

    public void setAgencyphone(String agencyphone) {
        this.agencyphone = agencyphone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMissionstatement() {
        return missionstatement;
    }

    public void setMissionstatement(String missionstatement) {
        this.missionstatement = missionstatement;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
      public int getAgencyID() {
        return agencyID;
    }

    public void setAgencyID(int agencyID) {
        this.agencyID = agencyID;
    }
   
}
