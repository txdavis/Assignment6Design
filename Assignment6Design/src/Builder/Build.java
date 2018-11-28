package Builder;


    public class Build {
        private WBHiveBuilder hive;

        public Build(WBHiveBuilder hive) {
            this.hive = hive;
        } 
        public Hive getHive(){
            return this.hive.getHive();
        }

        public void construct() {
            this.hive.makeRoom();
            this.hive.getList();

        }
}
