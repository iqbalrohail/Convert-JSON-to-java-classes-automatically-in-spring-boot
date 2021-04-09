# Convert-JSON-to-java-classes-automatically-in-spring-boot

# Step 1:

--> create a file named as schema in resources directory and place a valid JSON file there

# valid JSON Example 

{
	"match_id": 85,
	"series": "CSA T20 Challenge 2021",
	"match_date": "2021-02-23",
	"match_time": "13:30:00",
	"matchs": "9th Match",
	"venue": "Kingsmead, Durban",
	"match_type": "T20",
	"match_status": "Finished",
	"min_rate": "",
	"max_rate": "",
	"fav_team": "Dono",
	"s_ovr": "",
	"s_min": "",
	"s_max": "",
	"session": null,
	"result": "",
	"team_a_id": 19,
	"team_a": "Warriors",
	"team_a_short": "WAR",
	"team_a_img": "http:\/\/65.0.215.109\/webroot\/img\/teams\/1721186249_team.png",
	"team_a_score": {

		"score": 158,
		"wicket": 10,
		"ball": "19.2"

	},
	"team_b_id": 18,
	"team_b": "Cape Cobras",
	"team_b_short": "COB",
	"team_b_img": "http:\/\/65.0.215.109\/webroot\/img\/teams\/2128302060_team.jpg",
	"team_b_score": {

		"score": 181,
		"wicket": 5,
		"ball": "20"

	}
}



# Step 2 :

--> open pom.xml file and download the plugin given below ,

			<plugin>

				<groupId>org.jsonschema2pojo</groupId>
				<artifactId>jsonschema2pojo-maven-plugin</artifactId>
				<version>1.1.0</version>
				<configuration>
					<sourceDirectory>${basedir}/src/main/resources/schema</sourceDirectory>
					<targetPackage>com.example.com</targetPackage>
					<sourceType>json</sourceType>
				</configuration>
				<executions>
					<execution>
						<goals>
							<goal>generate</goal>
						</goals>
					</execution>
				</executions>
			</plugin>

# Step 3 :

--> add the below plugin in plugin section as well 

			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
				<release>11</release>
				</configuration>
			</plugin>
      
# Step 4 :

--> Add the following Dependencies in dependency section of pom.xml

		<dependency>
			<groupId>commons-lang</groupId>
			<artifactId>commons-lang</artifactId>
			<version>2.4</version>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
		</dependency>
    
# Step 5 :

--> Update your project

A target folder would be created 

# Step 6 :

--> check # target/generated-sources/jsonschema2pojo/com.example.com

# Your JSON would be converted into Java classes
    
