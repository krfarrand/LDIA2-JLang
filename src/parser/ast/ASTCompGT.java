/* Generated By:JJTree: Do not edit this line. ASTCompGT.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=intepreter.BaseASTNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package parser.ast;

public
class ASTCompGT extends SimpleNode {
  public ASTCompGT(int id) {
    super(id);
  }

  public ASTCompGT(Jlang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JlangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=499ef5a35bb78b68433d8f3b9b6bbab8 (do not edit this line) */
