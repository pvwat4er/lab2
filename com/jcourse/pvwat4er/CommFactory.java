package com.jcourse.pvwat4er;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CommFactory {

    private static final Map<String, Command> commandMap = new HashMap<>();

    private final static CommFactory ourInstance = new CommFactory();

    public static CommFactory getInstance() {

        return ourInstance;
    }

    private CommFactory() {
        Properties properties = new Properties();
        System.out.println(CommFactory.class.getResource("").getPath());
        try(InputStream in = CommandsFactory.class.getResourceAsStream("commands.properties")){
            properties.load(in);
        }catch (IOException e){
            System.out.println("Чтение файла commands.properties завершилось с ошибкой!");
        }

        for (String key : properties.stringPropertyNames()){
            properties.get(key);
            try{
                Class cl = Class.forName(properties.getProperty(key));
                commandMap.put(key, (Command) cl.newInstance());
            } catch (Exception e) {
                System.out.println("Не удалось прочитать класс: " + key );
            }
        }
    }

    public static Command getCommandByName(String commandName){
        return commandMap.get(commandName);
    }
}
