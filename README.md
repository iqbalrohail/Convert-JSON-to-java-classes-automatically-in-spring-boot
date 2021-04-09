# Convert-JSON-to-java-classes-automatically-in-spring-boot

# Step 1:

--> create a file named as schema in resources directory and place a valid JSON file there

# valid JSON Example 

{
    "glossary": {
        "title": "example glossary",
		"GlossDiv": {
            "title": "S",
			"GlossList": {
                "GlossEntry": {
                    "ID": "SGML",
					"SortAs": "SGML",
					"GlossTerm": "Standard Generalized Markup Language",
					"Acronym": "SGML",
					"Abbrev": "ISO 8879:1986",
					"GlossDef": {
                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
						"GlossSeeAlso": ["GML", "XML"]
                    },
					"GlossSee": "markup"
                }
            }
        }
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
    
