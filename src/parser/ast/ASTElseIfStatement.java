/* Generated By:JJTree: Do not edit this line. ASTElseIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTElseIfStatement extends SimpleNode {
  public ASTElseIfStatement(int id) {
    super(id);
  }

  public ASTElseIfStatement(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9fde5f2145685eaa6bb824f3e480e77f (do not edit this line) */
