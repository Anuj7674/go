package banking_utilitier;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class readconfig {

    Properties pro;
    public readconfig(){

        File src= new File("./Configuration/config.properties");
        try{

            FileInputStream fis = new FileInputStream(src);

            pro = new Properties();
            pro.load(fis);
        } catch (Exception  e) {

            System.out.println(e.getMessage());


        }

    }

    public String getApplicationURL(){

         String baseurl= pro.getProperty("baseurl");
                 return baseurl;
    }
    public String getUsername(){

        String username = pro.getProperty("username");
        return username;
    }

    public String getpassword(){

        String password = pro.getProperty("password");
        return password;
    }
    public String getChromepath(){

        String chromepath=pro.getProperty("chromepath");
        return chromepath;
    }

    public String getfirefoxpath(){

        String firefoxpath= pro.getProperty("firefoxpath");
        return firefoxpath;
    }
}
