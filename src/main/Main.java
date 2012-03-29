/**
 *
 */
package main;

import graph.Graph;

/**
 * Dominating set main class
 * @author Hussain Al-Mutawa
 * @version 1.0
 * @since 1.0
 */
public class Main {

	public static void main(String[]args){
		Graph g = new Graph('u',"{(e1,a,b),(e2,b,g),(e3,b,c),(e4,c,g),(e5,g,d),(e6,g,e),(e7,f,e),(e8,a,f),(e9,g,f)}");
		System.out.println(g.getVerteciesPrologSyntax());
		System.out.println(g.getEdgesPrologSyntax());
		System.out.println(g.getNeighborsPrologSyntax());
		System.out.println(g.getConnectedPrologSyntax());
		System.out.println(g.getGraphPrologSyntax());
	}

}
