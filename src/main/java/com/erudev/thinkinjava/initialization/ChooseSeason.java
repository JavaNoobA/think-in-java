package com.erudev.thinkinjava.initialization;

/**
 * Created by eru on 2020/1/12.
 */
public class ChooseSeason {
    SeasonEnum season;

    public ChooseSeason(SeasonEnum season){
        this.season = season;
    }

    public void choose(){
        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINNER:
                System.out.println("冬天");
                break;
            default:
                System.out.println("选择出错了");
        }
    }

    public static void main(String[] args) {
        ChooseSeason
                one = new ChooseSeason(SeasonEnum.SPRING),
                two = new ChooseSeason(SeasonEnum.AUTUMN),
                three = new ChooseSeason(SeasonEnum.SUMMER);
        one.choose();
        two.choose();
        three.choose();
    }
}
