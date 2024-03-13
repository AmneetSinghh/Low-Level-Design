package company_test.Quince.implementation.service;
import company_test.Quince.implementation.exceptions.AlreadyFoundException;
import company_test.Quince.implementation.model.Directory;

import java.util.HashMap;
import java.util.Map;


// for globally managing all directories.
public class DirectoryManager {
    Map<Integer,Directory> directories = new HashMap<>();
    private FileManager fileManager;

    public Directory getDirectoryById(int id){
        return directories.get(id);
    }

    public void create(Directory directory){
        if(!directories.containsKey(directory.getId())){
            directories.put(directory.getId(),directory);
        }
        else{
            throw new AlreadyFoundException(directory.getName()+ " directory already present");
        }
    }


}
