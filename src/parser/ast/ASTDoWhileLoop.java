/* Generated By:JJTree: Do not edit this line. ASTDoWhileLoop.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTDoWhileLoop extends SimpleNode {
  public ASTDoWhileLoop(int id) {
    super(id);
  }

  public ASTDoWhileLoop(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=aa45b86404a34a43a9e934e507a29897 (do not edit this line) */