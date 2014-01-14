//Program:        PositiveMaturityApp
//Description:    File connects the Positive Maturity appliction to its Agency database. CHANGES TO THIS FILE MAY
//                EFFECT THE WHOLE APPLICATION. The connection is established through a SQL Server Authenticated username
//				  and password. The file is meant to be kept confidential. 
//Author:         Jauan Davis
//Revised:        10/07/2013
//Language:       Java
//IDE:            NetBeans 7.2
//************************************************************************************************************

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class DatabaseConnection {
    
    //Connecting to the database
	//password for the application. Change the value of the string to the desired password. String not case sensitive when the
	//user enters at the login screen
   
    private Connection getConnection(){
        
        Connection connection= null;
        try {
          Class.forName("net.sourceforge.jtds.jdbc.Driver");
          String hostname="";
          String url="jdbc:jtds:sqlserver://";//Connection string for the PM01/Consortium server
          String username="";
          String password="";
          
          
          connection= DriverManager.getConnection(url,username,password);
          return connection;
        }
        catch (SQLException e) {
            System.out.println(e);
            System.out.println("This did not work first");
            return null;
        }catch (Exception a){
            System.out.println(a);
            System.out.println("this did not work");
            return null;
        }
        
    }//End getConnection
    
//********************************************************************************************************
//SELECT QUERIES
    
      public TableModel getagencyTable(){
            
        String sql="select name, street, city, zip, agency_phone from Agency order by name asc";
        
        try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }//end getagencyTable
    
      public TableModel getbenefitsTable(){
            
        String sql="select name as Name, summary as Summary from Benefits";
        
        try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }//End getbenefitsTable
      
        public boolean Namesearchquery(String s, agency a){
      String sql= "select name,street, city, agency_phone, website, contact_person, fax, email, mission_statement,eligibility, zip, agencyID from Agency where name= '"+s+"'";

      try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
          while(rs.next()){
              a.setName(rs.getString(1));
              a.setStreet(rs.getString(2));
              a.setCity(rs.getString(3));
              a.setAgencyphone(rs.getString(4));
              a.setWebsite(rs.getString(5));
              a.setContactperson(rs.getString(6));
              a.setFax(rs.getString(7));
              a.setEmail(rs.getString(8));
              a.setMissionstatement(rs.getString(9));
              a.setEligibility(rs.getString(10));
              a.setZip(rs.getString(11));
              a.setAgencyID(rs.getInt(12));
              
              
          }
          return true;
      } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
     
    }//End Namesearchquery
        public boolean Categoryquery(String s, category c){
      String sql= "select serviceid, name, summary from Benefits where name= '"+s+"'";

      try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
          while(rs.next()){
             c.setServiceID(rs.getInt(1));
             c.setName(rs.getString(2));
             c.setDescription(rs.getString(3));
          }
          return true;
      } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
     
    }//End Namesearchquery
   
  public TableModel Zipsearchtable(String s){
       
        String sql="select name, street, city, agency_phone, contact_person from Agency where zip =" +s;
        
        try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }//end Zipsearch
      
  public TableModel CategorySearchtable(String s){
            
        String sql="select a.name, a.street, a.city, a.zip, a.agency_phone, a.contact_person from Agency_Service Ags "+
	"inner join Agency A "+
	"on Ags.agencyID = A.agencyID "+
	"inner join Benefits B "+
	"on Ags.serviceID = B.serviceID "+
	"where B.name LIKE '%"+s+"%'";
        
        try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }//end CategorySearch  
  
  public TableModel AgencyServices(String s){
            
        String sql="select B.name "+
	"from Agency_Service Ags "+
	"inner join Agency A "+
	"on Ags.agencyID = A.agencyID "+
	"inner join Benefits B "+
	"on Ags.serviceID = B.serviceID "+
	"where A.name= '"+s+"'";
        
        try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
  }  
  
     public TableModel Namesearchtable(String s){
      String sql= "select name, street, city, agency_phone, agencyID from Agency where name LIKE '%"+s+"%'";

     try(Connection connection= getConnection(); 
                PreparedStatement ps = connection.prepareStatement(sql); 
                ResultSet rs = ps.executeQuery()){
            return DbUtils.resultSetToTableModel(rs);
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
       
    }//End Namesearchquery
 //************************************************************************************************************************  
 //INSERT QUERIES 
     
    public boolean addagency(agency a){
        String sql = "insert into Agency(name, street, city, agency_phone, website, contact_person, fax, email, mission_statement, eligibility, zip) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
         try(Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)){
            ps.setString(1,a.getName());
            ps.setString(2, a.getStreet());
            ps.setString(3, a.getCity());
            ps.setString(4, a.getAgencyphone());
            ps.setString(5, a.getWebsite());
            ps.setString(6, a.getContactperson());
            ps.setString(7, a.getFax());
            ps.setString(8, a.getEmail());
            ps.setString(9, a.getMissionstatement());
            ps.setString(10, a.getEligibility());
            ps.setString(11, a.getZip());
            ps.executeQuery();
            
            return true;
                    
            
        }catch (SQLException e){
            System.out.println(e);
            return false;
        }
    }//end addagency
    
    public boolean addcategory(category c){
        String sql= "insert into Benefits(name, summary) values (?, ?)";
        
        try(Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)){
            ps.setString(1, c.getName());
            ps.setString(2, c.getDescription());
            ps.executeQuery();
            return true;
                    
        }catch (SQLException e){
            System.out.println(e);
            return false;
        }
     }//end addcategory
    
      
  public boolean addagencyservice(agency a, int serviceID){
      String sql= "insert into Agency_Service (agencyID, serviceID) values(?,?)";
       
      try(Connection connection= getConnection(); 
              PreparedStatement ps= connection.prepareStatement(sql)){
              ps.setString(1, String.valueOf(a.getAgencyID()));
              ps.setString(2,String.valueOf(serviceID));
              ps.executeQuery();
              return true;
          
      }catch (SQLException e) {
            System.out.println(e);
            return false;
        }
      
  }

//************************************************************************************************************
//DELETE QUERIES
    
    public boolean deleteagency(agency a){
        String sql= "delete from Agency where agencyID = ?";

        try (Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)) {
            
          ps.setString(1, String.valueOf(a.getAgencyID()));
          
            
          ps.executeQuery();
          return true;
                       
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }//End deleteagency
    
    public boolean deletecategory(category c){
        String sql= "delete from Benefits where name = ?";
        
        try (Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)) {
            ps.setString(1, String.valueOf(c.getName()));
            ps.executeQuery();
            return true;
        }
            catch (SQLException e){
            System.out.println(e);
            return false;
        }
        
    }//end deetecategory
    
        public boolean deleteagencyservices(agency a){
        String sql= "delete from Agency_Service where agencyID = ?";
        
        try (Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)) {
            ps.setString(1, String.valueOf(a.getAgencyID()));
            ps.executeQuery();
            return true;
        }
            catch (SQLException e){
            System.out.println(e);
            return false;
        }
        }//end deleteagencyservice
        
        public boolean deleteagencyserviceswithservicename(agency a, category c){
        String sql= "delete from Agency_Service where agencyID = ? and serviceID= ?";
        
        try (Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)) {
            ps.setString(1, String.valueOf(a.getAgencyID()));
            ps.setString(2, String.valueOf(c.getServiceID()));
            ps.executeQuery();
            return true;
        }
            catch (SQLException e){
            System.out.println(e);
            return false;
        }
        
    }//end deleteagencyservicewithservicename
   //***********************************************************************************************************
   //UPDATE QUERIES
    public boolean updateagency(agency a){
        String sql = "update agency set street = ?, city = ?, agency_phone = ?, website = ?, contact_person = ?, fax = ?, email = ?, mission_statement = ?, eligibility = ?, zip= ? where name = ?";
        
        try(Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)){
            ps.setString(1,a.getStreet());
            ps.setString(2,a.getCity());
            ps.setString(3,a.getAgencyphone());
            ps.setString(4,a.getWebsite());
            ps.setString(5,a.getContactperson());
            ps.setString(6,a.getFax());
            ps.setString(7,a.getEmail());
            ps.setString(8,a.getMissionstatement());
            ps.setString(9,a.getEligibility());
            ps.setString(10,a.getZip());
            ps.setString(11,a.getName());
            
            ps.executeQuery();
            
            return true;
                    
            
        }catch (SQLException e){
            System.out.println("e");
            return false;
    }
    }//end updateagency
    
    public boolean updateCategory(category c, String servicename){
        String sql="update Benefits set name= ?, summary= ? where name LIKE '"+servicename+"'";
        
        try(Connection con = getConnection(); PreparedStatement ps= con.prepareStatement(sql)){
            ps.setString(1, c.getName());
            ps.setString(2,c.getDescription());
            
            ps.executeQuery();
           return true;
                     
        }catch (SQLException e){
            System.out.println("e");
            return false;
    }
    }
//******************************************************************************************************        
}//end DatbaseConnection
