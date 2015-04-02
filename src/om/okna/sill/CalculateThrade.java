package om.okna.sill;

import java.util.Map;
import javax.swing.table.DefaultTableModel;
import static om.okna.sill.MainSillFrame.ResultsField;
import static om.okna.sill.MainSillFrame.SegmentsTextPane;
import static om.okna.sill.MainSillFrame.ValueTable;

/**
 *
 * @author Виктор
 */
class CalculateThrade extends Thread {

    static int[] sillSize;
    static int[] sillAmount;
    
    void collectArray(){
        DefaultTableModel model = (DefaultTableModel) ValueTable.getModel();
        sillSize = new int[model.getRowCount()];
        sillAmount = new int[model.getRowCount()];
        for (int i = 0; i < model.getRowCount(); i++) {
            int rowSize = model.getValueAt(i, 0).hashCode();
            int rowAmount = model.getValueAt(i, 1).hashCode();
            sillSize[i] = rowSize;
            sillAmount[i] = rowAmount;
        }
    }
    
    void addCombination(String s){
        SegmentsTextPane.setText(SegmentsTextPane.getText() + s);
    }
    
    void goCutting(){
        int i = 0;
        Map<Integer, Integer> map;
        CuttingStock cuttingStock = new CuttingStock(6001, sillSize, sillAmount);
        while (cuttingStock.hasMoreCombinations()) {
            addCombination("Отрезки хлыста № " + (++i) + "\n");
            ResultsField.setText(String.valueOf(i));
            map = cuttingStock.nextCombination();
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                Integer key = entry.getKey();
                Integer value = entry.getValue();
                addCombination(key + "  *  " + value + "\n");
            }
        }
    }
    
    @Override
    public void run() {
        collectArray();
        goCutting();
    }
}
