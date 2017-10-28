package pl.akademiakodu.model.translationcompany;

public class TranslationCompany {
    public static void main(String[] args) {
        //specificUseCase();
        TranslationCompany translationCompany = new TranslationCompany();
        translationCompany.generalUseCase();

    }

    public void specificUseCase(){
        Worker panJanek = new PanJanek();
        TranslateWorker translateWorkerZosia =new TranslateWorkerZosia();
        AccountantWorker accountantWorkerGreg = new AccountantWorkerGreg();

        panJanek.work();
        translateWorkerZosia.work();
        translateWorkerZosia.workClients();

        accountantWorkerGreg.work();
        accountantWorkerGreg.workBuisness();
    }

    public void generalUseCase(){
        Worker panJanek = new PanJanek();
        Worker translateWorkerZosia =new TranslateWorkerZosia();
        Worker accountantWorkerGreg = new AccountantWorkerGreg();

        panJanek.work();
        translateWorkerZosia.work();
        //translateWorkerZosia.workClients();

        accountantWorkerGreg.work();
        //accountantWorkerGreg.workBuisness();
    }
}
