package graph;

import java.util.HashSet;
import java.util.Set;

public class Vertex {
	private final Set<Vertex>neighborVertices;
	private final String name;
	private final Set<Edge>edges;
	private boolean visited;
	public Vertex(String name){
		this.neighborVertices=new HashSet<Vertex>();
		this.edges=new HashSet<Edge>();
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void addEdge(Edge edge){
		if(this.edges.contains(edge)){
			throw new IllegalArgumentException("["+edge+"] has been already connected to this node ["+this+"]");
		}
		this.edges.add(edge);
	}
	public Edge[] getEdges() {
		return edges.toArray(new Edge[this.edges.size()]);
	}
	public Vertex[]getNeighborVertecies(){
		return neighborVertices.toArray(new Vertex[this.neighborVertices.size()]);
	}
	public void addNeighborVertix(Vertex vertix){
		this.neighborVertices.add(vertix);
	}
	@Override
	public String toString() {
		return this.name;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
