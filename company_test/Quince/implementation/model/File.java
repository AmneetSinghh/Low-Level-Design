package company_test.Quince.implementation.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class File {
    private int id;
    private String name;
    private String path;
    private int copyCount;
    private String copyPrefix;
    private Directory directory;
    // other fields.
}




/*
  d1-> file - copied

  d2 : ( file ) ->


d2 : 1000 files. Map.

 */

