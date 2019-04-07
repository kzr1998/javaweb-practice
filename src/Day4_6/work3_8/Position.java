package Day4_6.work3_8;

public class Position {
    //类型描述：能够描述职务编号、职务名称
    private String positionNum;//职务编号
    private String positionName;//职务名称
    private Member[] positionMember;//定义统计数组
    public Position()
    {

    }
    public Position(String positionNum,String positionName)
    {
        this.setPositionName(positionName);
        this.setPositionNum(positionNum);
    }
    public void setPositionNum(String positionNum)
    {
        this.positionNum=positionNum;
    }
    public String getPositionNum()
    {
        return this.positionNum;
    }
    public void setPositionName(String positionName)
    {
        this.positionName=positionName;
    }
    public String getPositionName()
    {
        return this.positionName;
    }
    public void setPositionMember(Member[] positionMember)
    {
        this.positionMember=positionMember;
    }
    public Member[] getPositionMember()
    {
        if(this.positionMember==null)
            this.positionMember=new Member[200];
        return this.positionMember;
    }

}


