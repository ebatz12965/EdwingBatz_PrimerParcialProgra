/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edwing
 */
public class ClassLibro {
        
    private String code;
    private String name;
    private String past;
    private String edit;
    private String year;
  
    
    public ClassLibro (String code, String name, String past, String edit, String year){
        this.code=code;
        this.name=name;
        this.past=past;
        this.edit=edit;
        this.edit=year;
    }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPast() {
            return past;
        }

        public void setPast(String past) {
            this.past = past;
        }

        public String getEdit() {
            return edit;
        }

        public void setEdit(String edit) {
            this.edit = edit;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    
}
