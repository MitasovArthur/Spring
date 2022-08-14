package Quest;

import inter.Quest;

public class QuestTraning implements Quest {
    @Override
    public boolean printQuest() {
        System.out.println("TraningQuest compl");
       return true;
    }
}
