package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPK id = new BelongingPK();

	private Integer positionInList;

	public Belonging() {
	}

	public Belonging(Game game, GameList list, Integer positionInList) {
		id.setGame(game);
		id.setGamelist(list);
		this.positionInList = positionInList;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPositionInList() {
		return positionInList;
	}

	public void setPositionInList(Integer positionInList) {
		this.positionInList = positionInList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
