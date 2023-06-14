package br.com.valkyrie.game.model;

import java.util.Date;

import br.com.valkyrie.map.model.Map;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb0002_game")
public class Game {
    
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
@Column(name="a0002_game_id")
private Long id;

//private Tournament tournament? -- which tournament owns this game?

private String team_one;
private String team_two;
//private String winner; decided by the winner of most maps. do business logic

//private Long roundsTeamOne; these objects goes into Map class.
//private Long roundsTeamTwo;
@Column(name = "a0002_numberOfMaps")
private Long numberOfMaps;

@Column(name = "a0002_isFinished")
private boolean isFinished;
@Column(name = "a0002_isCanceled")
private boolean isCanceled;

@Column(name = "a0002_initialDate")
private Date initialDate;
@Column(name = "a0002_finalDate")
private Date finalDate;
}
