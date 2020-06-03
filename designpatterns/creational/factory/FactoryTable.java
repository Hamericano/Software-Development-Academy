package factory;

import builder.TableBuilder;

public class FactoryTable {
    private TableBuilder OakTableBuilder;
    private TableBuilder BeechTableBuilder;

    public FactoryTable() {

        OakTableBuilder = new TableBuilder();

        OakTableBuilder.setColor("Dark brown");
        OakTableBuilder.setMaterial("Oak Wood");
        OakTableBuilder.setLength(100);
        OakTableBuilder.setWidth(80);
        OakTableBuilder.setHeight(60);
        OakTableBuilder.setHasRoundCorners(true);
        OakTableBuilder.setHasShinySurface(false);

        BeechTableBuilder = new TableBuilder();
        BeechTableBuilder.setColor("Light brown");
        BeechTableBuilder.setMaterial("Beech Wood");
        BeechTableBuilder.setHeight(70);
        BeechTableBuilder.setWidth(80);
        BeechTableBuilder.setLength(150);
        BeechTableBuilder.setHasRoundCorners(false);
        BeechTableBuilder.setHasShinySurface(true);
    }

    public TableBuilder.Table getTable(int option) {
        TableBuilder.Table table = null;
        if (option == 1) {
            table = OakTableBuilder.build();
        } else if (option == 2) {
            table = BeechTableBuilder.build();
        }
        return table;
    }
}
