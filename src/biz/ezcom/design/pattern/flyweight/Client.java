package biz.ezcom.design.pattern.flyweight;

/**
 * 客户端
 */
public final class Client {
    private Client() {}

    public static void main(final String[] args) {
        final String black = "black";
        final String white = "white";
        // 围棋中{(4,4), (4,16), (16,4), (16,16)}是4个星
        final ChessFactory factory = ChessFactory.getInstance();
        System.out.println("围棋开始...");
        factory.getChess(black).display(4, 4);
        factory.getChess(white).display(4, 16);
        factory.getChess(black).display(16, 4);
        factory.getChess(white).display(16, 16);
        System.out.println("四星被占");
    }
}
