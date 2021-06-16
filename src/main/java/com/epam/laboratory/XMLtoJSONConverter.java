package com.epam.laboratory;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.json.XML;

import java.io.*;

public class XMLtoJSONConverter {

    private static final Logger LOGGER = Logger.getLogger(XMLtoJSONConverter.class);

    private static final int INDENT_FACTOR = 3;

    public void convert(String PATH_TO_XML_FILE, String PATH_TO_JSON_FILE) {
        try {
            File xmlFile = new File(PATH_TO_XML_FILE);
            InputStream inputStream = new FileInputStream(xmlFile);
            StringBuilder builder = new StringBuilder();
            int ptr;
            while ((ptr = inputStream.read()) != -1) {
                builder.append((char) ptr);
            }

            String xml = builder.toString();
            JSONObject jsonObj = XML.toJSONObject(xml);
            System.out.print(jsonObj);
            FileWriter fileWriter =
                    new FileWriter(PATH_TO_JSON_FILE);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);
            bufferedWriter.write(jsonObj.toString(INDENT_FACTOR));
            bufferedWriter.close();
        } catch (IOException ex) {
            LOGGER.error("Error writing to file '" + PATH_TO_JSON_FILE + "'");
        }
    }
}