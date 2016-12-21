/**
 * 
 * @author Nitinkumar Gove
 *
 */
public class Configuration {
	
	static Configuration config = null;
	
	private String language;
	private String timezone;
	private String region;
	
	private Configuration(){
		language = "english";
		timezone = "GMT +5:50";
		region = "APAC";
	}
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}



	public static Configuration getConfiguration(){
		if(config==null){
			config = new Configuration();
			return config;
		}
		else
			return config;
	}
	
	public void printConfiguration(){
		System.out.println("\nlanguage - " + this.language);
		System.out.println("timezone - " + this.timezone);
		System.out.println("region - " + this.region);
		
	}
	
	

}
