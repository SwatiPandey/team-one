package teamOne.DAO;


public class DAOFactory {

	public static UserDAO getUserDAO(){
		return new UserDAOImp();
	}
}
