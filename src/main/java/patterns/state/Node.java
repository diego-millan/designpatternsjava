package patterns.state;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Node {
    private Set<Node> adjacentNodes = new HashSet<>();
    private NodeColor nodeColor;
    private String name;

    public Node(String name) {
        this.name = name;
        this.nodeColor = new WhiteNode();
    }

    public void depthSearch(List<Node> nodeList) {
        nodeColor.search(this, nodeList);
    }

    public Set<Node> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void addAdjacentNode(Node adjacent) {
        adjacentNodes.add(adjacent);
    }

    public void setNodeColor(NodeColor nodeColor, List<Node> nodeList) {
        this.nodeColor = nodeColor;
        nodeColor.update(this, nodeList);
    }

    public String toString() {
        return name;
    }
}
