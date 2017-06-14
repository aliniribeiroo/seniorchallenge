package br.com.seniorchallenge.model;

public class MarsGround {
	
	private final int MIN_GROUND_POSITION = 0;
	private final int MAX_GROUND_POSITION = 5;
	
	/**
	 * Foi desenvolvida esta classe para informar quando houve a colis�o entre o Robo e o seu limite de explora��o.
	 * Nela � verificado se a posi��o recebida � maior ou menor que a pozi��o m�xima e m�nima para a sua explora��o.
	 * */

	public boolean hasCollided(Position position) throws Exception {

		if (position.getCoordinateX() > MAX_GROUND_POSITION || position.getCoordinateX() < MIN_GROUND_POSITION
				|| position.getCoordinateY() > MAX_GROUND_POSITION || position.getCoordinateY() < MIN_GROUND_POSITION) {
			throw new Exception("400 Bad Request");
		}
		return false;
	}

}
