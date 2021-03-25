public class Page {
    private String pageText;

    public Page(String pageText){
        this.pageText = pageText;
    }
    public Page(){
        this("");
    }
    public String getPageText(){
        return this.pageText;
    }
}
