package company_test.Quince.implementation.model;

import company_test.Quince.implementation.service.FileManager;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Directory {

    private int id;
    private String name;
    private FileManager fileManager;


}


