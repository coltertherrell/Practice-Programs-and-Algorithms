
public class Player{
	private static String league;
	public String getLeague(){
		return league;
	}
	public void setLeague(String lg){
		Player.league = lg;
	}
	public static void main(String[] ags){
		Player p = new Player();
		p.setLeague("masters");
		if(p.getLeague().equals("masters") || p.getLeague() == "grand master"){
			System.out.print("This player is not a chobo");
		}
		else{
			System.out.print("This player is a chobo");
		}
	}
}


