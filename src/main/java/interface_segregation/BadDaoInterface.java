package interface_segregation;

public interface BadDaoInterface {
    public void openConnection();
    public void closeConnection();
    public void createRecord();
    public void openFile();
    public void deleteRecord();
}
