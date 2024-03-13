package company_test.Quince.implementation.service;

import MachineCoding_HLD.CacheSystem.Cache.exceptions.NotFoundException;
import company_test.Quince.implementation.exceptions.AlreadyFoundException;
import company_test.Quince.implementation.model.File;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileManager implements FileOperations {

    private Map<Integer, File> files = new HashMap<>();  // files are related to directory.
    private Map<String, File> fileNames = new HashMap<>();  // files are related to directory.

    File setLatestCopied;

    public File getFileById(int path){
        return files.get(path);
    }

    public void create(File file){
        if(!files.containsKey(file.getId())){
            files.put(file.getId(),file);
        }
        else{
            throw new AlreadyFoundException(file.getName()+ " file already present");
        }
    }

    // at a directory level.
    @Override
    public void copy(int fileId) {
        if(!files.containsKey(fileId)){
            throw new NotFoundException(fileId + " not found");
        }
        File file = files.get(fileId);
        this.setSetLatestCopied(file);
    }

    @Override
    public void paste() {
        File currentFile = setLatestCopied;// file. prefix is empty for now.
        String nextFileName = (currentFile.getName()+currentFile.getCopyPrefix())+ (currentFile.getCopyCount() == 0 ? "1" : (currentFile.getCopyCount()+1));// nextName
        boolean newFile = false;
        while(fileNames.containsKey(nextFileName)){
            nextFileName +="1"; // new file.
            newFile = true;
        }

        if(newFile == false){
            currentFile.setCopyCount(currentFile.getCopyCount()+1);
            this.create(new File());// name = this, count = 0;
        }
        else{
            currentFile.setCopyPrefix(currentFile.getCopyPrefix()+"1");
            this.create(new File());// name = this, count = 0;// with naming.
        }
    }
}
