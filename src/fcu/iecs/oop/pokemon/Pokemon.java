package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	private int cp;
	private String nickname;
	private final PokemonType Type;
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return nickname;
	}
	public PokemonType getType() {
		return Type;
	}
	public Pokemon(String nickname, PokemonType type,int cp) {
		super();
		this.cp = cp;
		this.nickname = nickname;
		this.Type = type;
	}
	public abstract void attack();
	
}