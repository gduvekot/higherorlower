package inleveropdracht;

enum rank {
	twee(1),
	drie(2),
	vier(3),
	vijf(4),
	zes(5),
	zeven(6),
	acht(7),
	negen(8),
	tien(9),
	boer(10),
	vrouw(11),
	koning(12),
	aas(1);
	
	private int rang;
	
	private rank(int i) {
		this.rang = i;
	}
}
	