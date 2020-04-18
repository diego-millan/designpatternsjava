package patterns.state;

import java.util.List;

public class GreyNode extends NodeColor {
    public void update(Node node, List<Node> nodeList) {
        for (Node adjacent : node.getAdjacentNodes()) {
            adjacent.depthSearch(nodeList);
            node.setNodeColor(new BlackNode(), nodeList);
        }
    }
}
