package com.xworkz.copy.AccessSpecifier.Boot;

import com.xworkz.copy.AccessSpecifier.*;

public class PgNameRunner {

	public static void main(String[] args) {
		PgName pgname = new PgName();
		PG pg=new PG("SaiPg", false, 45, "rajajinagar", 7, "Big", "lightPink", false, 4, true, false);
		pgname.goodPg(pg);
		System.out.println(pg.members);

	}

}
