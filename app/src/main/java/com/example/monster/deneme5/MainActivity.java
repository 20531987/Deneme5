package com.example.monster.deneme5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi;
    TextView hatme;
    Button hesapla, temizle;

    public String kucukhatme() {
      return  "\nKÜÇÜK HATME:\n" +
                "1. Hatmeye iştirak edecekler değirmi bir halka teşkil edecek şekilde otururlar.\n" +
                "2. 100 adet taş, hatmeye iştirak edecek şahıs adedince taksim edilir.\n" +
                "3. Hatmeyi idare edenin işareti üzerine gözler yumulur ve 25 defa Estağfirullah denir.\n" +
                "4. Rabıta-yı şerif nidası üzerine beş dakika kadar rabıta yapılır.\n" +
                "5. Fatiha-yı şerif nidası üzerine, nidayı yapan şahıs dahil sağ tarafındaki yedi kişi eûzü besmele ile birer adet Fatihayı şerif okur.\n" +
                "6. Salavât-ı şerif nidası üzerine herkes şahsına düşen taş adedince ve evvelinde eûzü besmele ile Allahümme salli alâ Muhammedin ve alâ âli Muhammed şeklinde salavât-ı şerifi okur.\n" +
                "7. Ya Bâkî, ente’l-Bâkî nidası üzerine herkes şahsına düşen taş adedince ve evvelinde eûzü bes mele çekmek sureti ile Yâ Bakî, ente’l-Bakî der ve bu beş defa tekrar edilir.\n" +
                "8. Fatiha-yı şerif nidası üzerine bu defa hatmeyi okuyan zat dahil sol tarafından yedi kişi birer defa eûzü besmele ile Fatiha-yı şerif okurlar.\n" +
                "9. Salavât-ı şerif nidası üzerine yine herkes elindeki taş adedince ve evvelinde eûzü besmele ile yukarıda metni verilen salavât-ı şerifeyi okur.\n" +
                "10. Hatmeyi idare eden veya bir başkası büyük silsile-yi şerifi okur.\n\n" +
                "BÜYÜK SİLSİLE-İ ŞERİF\n" +
                "Eûzübillâhimineşşeytânirracîm Bismillahirrahmanirrahîm\n" +
                "Elhamdülillah! Rabbil âlemin, elhamdülillâhi hakka hamdihi ve senâihi, ves salâtü ves selâmü alâ hayrı halkıhi Muhammedin (sallallâhu teâlâ aleyhi vesellem) ve âlâ âlihi va ashâbihi ve ezvâcihi ve ehli beytihi ecmaîn (rıdvânullahi teâlâ aleyhim ecmaîn).\n\n" +
                "Allâhümme belliğ ve evsil misle sevâbi hâzi-hil hatmetiş şerifeti badel kabûli minnâ bil fazli vel keremi, hediyyeten vâsıleten ilâ ruhi menbais sıdkı ves safa, eşrefil verâ, seyyidinâ Muhammedinil Mustafa (Sallallâhu teâlâ aleyhi ve sellem) ve ilâ ervâhi âlihi ve ezvâcihi ve ashâbihi ecmaîn (rıdvânullâhi teâlâ aleyhim ecmaîn).\n\n" +
                "Ve ilâ ervâhi küllin mines sâdatî silsiletit tarîkatil aliyyetin Nakşibendiyyeti vel Kâdiriyyeti ves Sühreverdiyyeti vel Kübreviyyeti vel Çeştiyye (kaddesallâhü teâlâ asrârehümül aliyyeh).\n\n" +
                "Ve alel husûsi ilâ ruhi şeyhinâ ve melâzinâ ve kıdvetinâ ve imamına ve imâmit tarîkatî zil feyzil carî ven nûris sârî eşşeyh bahâel hakkı vel hakikati ved din eşşeyh Muhammedinil üveysiyyil Buhariyyil Marûfi bi Şahı Nakşıbend (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi menbail maârifi vel kemâli seyyidis sâdâti hazreti eşşeyh esseyyid Emir Külâl (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mukbili aleyke veli mâsivâken nâsi eşşeyh Muhammed Baba Sammâsî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil vâlihi fi muhabbeti mevlâhül ganiyyil marûfi bi hazreti Azîzân Hâce Aliyyir Râmitinî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mu'ridi anil murâdid dünyeviyyi vel uhreviyyi eşşeyh Mahmûdil İnciriyyil Fağnevî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mütesellihi anil hicâbil beşeriyyeti eşşeyh Arifir Rîvegerî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbil evliyâi vel burhânil asfiyâi, kâmiil bidati muhyis sünneti şeyhul meşâyih Abdülhâlıkıl Gucdüvâni (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbil hakkânî vel gavsis Samedânî eşşeyh Ahmedil Fârûkiyyis Serhendiyyil marûfî bil İmâmir Rabbani el müceddidi lil elfıs sânî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbi dâiretil irşâd, gavsis sakaleyni ales sedâdis şâiri fillâhi er râkiis sâcidi zülcenâheyn hazreti Ziyâüddin mevlânâ eşşeyh Hâlid (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi menbail hilmi ve nûriz zülâmil hâdî beynel aşâiri vel akvam, hazreti sirâcüddin min halefi seyyidil enâmi mevlânâ eşşeyh esseyyid Abdullah (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi şeyhinel gayyurillezî bihi netebâha mevlânâl vakur kutbil irşâdi vel medar hazreti şihâbüddin mevlânâ eşşeyh esseyyid Tâhâ (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi sultânil küberâil mütekaddimîn ve kıdvetil küberâil müteahhirîn, gavsil âmmeti vel hâifîn, kutbil ümmeti ves sâlikîn ve muğîsil müstagîsîn mûnisil gurebâi vel âşıkîn, şeyhinel kâmilil mükemmilil üveysiyyi mevlânâ ve seyyidinâ ve senedinâ eşşeyh esseyyid Sıbgatullâhil Arvâsî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi sultânil arifin, ve kutbil aktâbil vâsılîn, el müteşerrifi bil fenâil mutlak, mürebbis sâlikine ilâ rabbihim alel vechil ehakki, nâşiriş şerîatil garrâi kâmiil bidatid darrâi, müceddidi âsâris selefi vet tabiîne ve mümehhidi bünyanit tarikatil halefi vellâhikin. El mutasarrıf! alel ıtlâkıllezi lem nerâ lehu nazîrün badel tefahhüsi fil âfâkı kâtıin nisbeti anil mübtedîit taği mevlânâ ve seyyidinâ ve ruhuna! feda şeyhinel kâmilil mükemmili eşşeyh şahı Abdurrahmânit Tâğî (Kuddise sımhu).\n\n" +
                "Ve ilâ ruhi sultânil vâsılîn ve umdeti küberâil âşıkîn, kutbil irşadı bil yakîn, menbail hilmi vel meârifı vel ihsan, sahibil ilmi vel edebi vel irfan el muhrik! mâsivallah. El müteşerrifi bil fenâi badel fena, sümmel bekai billahi badel beka el muhyiş şerîatil garrâi kâmiil bidatid darrâi ruhuna ve emvâlünal feda, şeyhinel kâmilil mükemmili eşşeyh Muhammedinis Sâmiyil Erzincâni (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sertâcil evliya ve burhanı kâffei mahlûki Huda, hazreti mefhari mürşidân, menbais sıdkı ves sadâkati vel hakîkati vel marifeti vel irfan, el muhriki mâsivallah bil cezbetil vâsılı ilallah, el müteşerrifi biş şerîati vet tarîkatil makbûleti vel edebi vel ihsan, ruhuna ve emvâlünal feda şeyhinel kâmilil mükemmili hadimi dergâhı hazreti Sâmî eşşeyh Şahı Muhammed Sâniyyil Erzincânî (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sultânil evliya ve mahremi sırrı esrarı enbiyâ, câmiil kemâlâtis sûriyyeti vel mâneviyyeti eşşeyhul ekber ve kutbul aktab, ruhuna ve emvâlünal feda mevlâyî, mevlâyî, mevlâyî ve seyyidî ve senedî ve men bihi temessüki ve bihi iftihâri ve minhu istimdâdî şeyhinel kâmilil mükemmilil üveysiyyil mürşidân, sertabibi âşıkân eşşeyh şahı Musa Dede Bayburdî (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sultân-il aşıkan ve gavsul azam. Sıtku tabii Tariki Nakşi Asalet ve sadakat timsali Tevazuda Abu Turab misali. İrşatı sohbette yoktur emsali. Merhamet ve metanette eşi bulunmayan. Tayyi mekanda sınır tanımayan. Hasrette Yakub’a Cemalde Yusuf’a Izdırap ve meşakkatte Eyyub’a emsal. Üveysiyül mürşidan. Eşşeyh es seyyid Abdurrahim er-erzincani. (Kuddise sırrihu)\n\n" +
                "Ve ilâ ervâhi küllin mines sâdâti vel hulefâi vel mürîdîne vel muhibfaîne vel mensûbîne vel müntesibîne ilâ hâzihit tarîkatil aliyyeti ve sâirit turuk. Allâhümmektüb misle sevâbıhâ fi sâhifeti amali küllin, verfa bihâ derecâti küllin, ve âli fî âlâil illiyyîne menzilete küllin ve zidnâ muhabbete inde cenabı küllin, ve efid aleynâ min berekâti küllin ve etmim lenâ sülûke, hâzihit tarîkatil aliyyeh ve veffiknâ li merdâti şeyhinâ ve imtisâli evâmirihi ve içtinâbı menâhihi verzuknal bekâe bike badel fenâi fike âlâ kademi sâdâtines sâlikine fihâ. Allâhümmağfırlenâ hatâyânâ veclübnâ ilâ muhabbetike bi muhabbeti evliyâike verzuknat tevfîka vel istikâmete âlâ dinike ve taâtike bi rahmetike yâ erhamerrâhimîn. Âmin, âmin vel hamdu lillâhi rabbil âlemîn...\n\n" +
                "Bu bitince bir aşr-ı şerif okur veya bir başkasına okutur. Diğerleri rabıta ve dua ile meşgul olurlar. Veyahut orada bulunmayan ihvan kardeşlerini zımnen hatmeye dahil ederler. " +
                "Aşr-ı şerif okunup “Fatiha” çağrısı yapıldıktan sonra hatmeyi idare eden kişi “Cenab-ı Allah noksanı ile kabul buyursun” der, “âmin, Allah razı olsun” denilerek gözler açılır ve küçük hatme tamamlanmış olur.";
    }

    public String buyukhatme() {
        return "\nBÜYÜK HATME:\n" +
                "Hatmeye iştirak edecekler 15'ten fazla, elem neşrah leke suresini bilenler de en az 10 kişi olursa büyük hatme okunması emredilmiştir.\n" +
                "1. Yine değirmi bir halka teşkil edecek şekilde oturulur.\n" +
                "2. Estağfirullah nidası üzerine herkes gözünü yumup eûzübesmele çektikten sonra 25'er defa estağfirullah der. Bu arada taş dağıtıp toplamayı bilen bir kişi halkanın içinde; elemneşrahleke sûresini bilen ve bu sûreyi bildiğini belli etmek için sağ avucu sol göğsü üzerinde açık tutularak kendisine taş verilmesini bekleyenlere, daha evvel ayrılmış 79 adet taşı dağıtmak için hazırlığını yapar.\n" +
                "3. Rabıtayı Şerif nidası üzerine herkes bir taraftan rabıtasıyla meşgul olurken bir taraftan da Elem neşrah leke taşlarının dağıtılmasını beklerler.\n" +
                "4. Fatihayı Şerif nidası üzerine, hatmeyi idare edenin sağ tarafındaki kendisine Fatiha taşı verilmiş veya Fatiha okunması daha önceden emredilmiş yedi kişi, Fatihayı Şerifi eûzü-besmele ile birer defa okurlar.\n" +
                "5. Salavât-ı Şerif nidası ile herkes evvelinde eûzübesmele çekerek elindeki taş adedince salavâtı şerif okur.\n" +
                "6. Elemneşrahleke-yi Şerif denilince yine evvelinde eûzübesmele, sonrakilerde sadece besmele ile kendisine taş dağıtılmış olanlar taşları adedince inşirah sûresini okurlar.\n\n" +
                "İnşirah Suresi:\n"+
                "Bismillahirrahmanirrahim\n" +
                "Elemneşrahleke sadrak. Ve vedağnâ anke vizrak, ellezi engada zahrak. Ve rafeğnâ leke zikrak. Feinne meal usri yusran inne meal usri yüsrâ. Feizâ ferağte fensab ve ilâ rabbike ferğab.\n\n"+
                "7. Halka içinde taş dağıtan görevli bu defa daha önce dağıttığı 79 adet Elemneşrahleke taşına ilaveten 21 taşı daha önce taş almamış olanlara, herkes taş almışsa icabına göre dağıtır. Böylece dağıtılan taş 100 adedi bulmuş olur.\n" +
                "8. İhlâs-ı Şerif nidası üzerine yine başında eûzübesmele ile herkes taşı adedince ihlas sûresi okur. Bu 10 defa tekrarlanır. Böylece 1000 İhlâs-ı Şerif okunmuş olur. Hatmeyi idare eden bir fazla okuyarak bunu 1001'e tamamlar.\n" +
                "9. İkinci Fatiha-yı şerif nidası yapılır. Bu sefer hatmeyi idare edenin sol tarafındaki, kendisine Fatiha taşı verilmiş veya ikinci Fatihayı okuması emre dilmiş 7 kişi eûzübesmele ile birer Fatiha okurlar.\n" +
                "10. İkinci Salavât-ı Şerif nidası üzerine herkes elindeki taş adedince evvelinde eûzü besmele çekerek salavât-ı şerif okur.\n" +
                "11. Büyük Silsileyi Şerifin ve aşrı şerifin okunmasından sonra, Küçük Silsileyi Şerif okunarak usulünce büyük hatme tamamlanır.\n\n"+
                "BÜYÜK SİLSİLE-İ ŞERİF\n" +
                "Eûzübillâhimineşşeytânirracîm Bismillahirrahmanirrahîm\n" +
                "Elhamdülillah! Rabbil âlemin, elhamdülillâhi hakka hamdihi ve senâihi, ves salâtü ves selâmü alâ hayrı halkıhi Muhammedin (sallallâhu teâlâ aleyhi vesellem) ve âlâ âlihi va ashâbihi ve ezvâcihi ve ehli beytihi ecmaîn (rıdvânullahi teâlâ aleyhim ecmaîn).\n\n" +
                "Allâhümme belliğ ve evsil misle sevâbi hâzi-hil hatmetiş şerifeti badel kabûli minnâ bil fazli vel keremi, hediyyeten vâsıleten ilâ ruhi menbais sıdkı ves safa, eşrefil verâ, seyyidinâ Muhammedinil Mustafa (Sallallâhu teâlâ aleyhi ve sellem) ve ilâ ervâhi âlihi ve ezvâcihi ve ashâbihi ecmaîn (rıdvânullâhi teâlâ aleyhim ecmaîn).\n\n" +
                "Ve ilâ ervâhi küllin mines sâdatî silsiletit tarîkatil aliyyetin Nakşibendiyyeti vel Kâdiriyyeti ves Sühreverdiyyeti vel Kübreviyyeti vel Çeştiyye (kaddesallâhü teâlâ asrârehümül aliyyeh).\n\n" +
                "Ve alel husûsi ilâ ruhi şeyhinâ ve melâzinâ ve kıdvetinâ ve imamına ve imâmit tarîkatî zil feyzil carî ven nûris sârî eşşeyh bahâel hakkı vel hakikati ved din eşşeyh Muhammedinil üveysiyyil Buhariyyil Marûfi bi Şahı Nakşıbend (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi menbail maârifi vel kemâli seyyidis sâdâti hazreti eşşeyh esseyyid Emir Külâl (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mukbili aleyke veli mâsivâken nâsi eşşeyh Muhammed Baba Sammâsî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil vâlihi fi muhabbeti mevlâhül ganiyyil marûfi bi hazreti Azîzân Hâce Aliyyir Râmitinî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mu'ridi anil murâdid dünyeviyyi vel uhreviyyi eşşeyh Mahmûdil İnciriyyil Fağnevî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil mütesellihi anil hicâbil beşeriyyeti eşşeyh Arifir Rîvegerî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbil evliyâi vel burhânil asfiyâi, kâmiil bidati muhyis sünneti şeyhul meşâyih Abdülhâlıkıl Gucdüvâni (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbil hakkânî vel gavsis Samedânî eşşeyh Ahmedil Fârûkiyyis Serhendiyyil marûfî bil İmâmir Rabbani el müceddidi lil elfıs sânî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ rûhil kutbi dâiretil irşâd, gavsis sakaleyni ales sedâdis şâiri fillâhi er râkiis sâcidi zülcenâheyn hazreti Ziyâüddin mevlânâ eşşeyh Hâlid (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi menbail hilmi ve nûriz zülâmil hâdî beynel aşâiri vel akvam, hazreti sirâcüddin min halefi seyyidil enâmi mevlânâ eşşeyh esseyyid Abdullah (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi şeyhinel gayyurillezî bihi netebâha mevlânâl vakur kutbil irşâdi vel medar hazreti şihâbüddin mevlânâ eşşeyh esseyyid Tâhâ (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi sultânil küberâil mütekaddimîn ve kıdvetil küberâil müteahhirîn, gavsil âmmeti vel hâifîn, kutbil ümmeti ves sâlikîn ve muğîsil müstagîsîn mûnisil gurebâi vel âşıkîn, şeyhinel kâmilil mükemmilil üveysiyyi mevlânâ ve seyyidinâ ve senedinâ eşşeyh esseyyid Sıbgatullâhil Arvâsî (Kuddise sırrıhu).\n\n" +
                "Ve ilâ ruhi sultânil arifin, ve kutbil aktâbil vâsılîn, el müteşerrifi bil fenâil mutlak, mürebbis sâlikine ilâ rabbihim alel vechil ehakki, nâşiriş şerîatil garrâi kâmiil bidatid darrâi, müceddidi âsâris selefi vet tabiîne ve mümehhidi bünyanit tarikatil halefi vellâhikin. El mutasarrıf! alel ıtlâkıllezi lem nerâ lehu nazîrün badel tefahhüsi fil âfâkı kâtıin nisbeti anil mübtedîit taği mevlânâ ve seyyidinâ ve ruhuna! feda şeyhinel kâmilil mükemmili eşşeyh şahı Abdurrahmânit Tâğî (Kuddise sımhu).\n\n" +
                "Ve ilâ ruhi sultânil vâsılîn ve umdeti küberâil âşıkîn, kutbil irşadı bil yakîn, menbail hilmi vel meârifı vel ihsan, sahibil ilmi vel edebi vel irfan el muhrik! mâsivallah. El müteşerrifi bil fenâi badel fena, sümmel bekai billahi badel beka el muhyiş şerîatil garrâi kâmiil bidatid darrâi ruhuna ve emvâlünal feda, şeyhinel kâmilil mükemmili eşşeyh Muhammedinis Sâmiyil Erzincâni (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sertâcil evliya ve burhanı kâffei mahlûki Huda, hazreti mefhari mürşidân, menbais sıdkı ves sadâkati vel hakîkati vel marifeti vel irfan, el muhriki mâsivallah bil cezbetil vâsılı ilallah, el müteşerrifi biş şerîati vet tarîkatil makbûleti vel edebi vel ihsan, ruhuna ve emvâlünal feda şeyhinel kâmilil mükemmili hadimi dergâhı hazreti Sâmî eşşeyh Şahı Muhammed Sâniyyil Erzincânî (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sultânil evliya ve mahremi sırrı esrarı enbiyâ, câmiil kemâlâtis sûriyyeti vel mâneviyyeti eşşeyhul ekber ve kutbul aktab, ruhuna ve emvâlünal feda mevlâyî, mevlâyî, mevlâyî ve seyyidî ve senedî ve men bihi temessüki ve bihi iftihâri ve minhu istimdâdî şeyhinel kâmilil mükemmilil üveysiyyil mürşidân, sertabibi âşıkân eşşeyh şahı Musa Dede Bayburdî (Kuddise sırrihu).\n\n" +
                "Ve ilâ ruhi sultân-il aşıkan ve gavsul azam. Sıtku tabii Tariki Nakşi Asalet ve sadakat timsali Tevazuda Abu Turab misali. İrşatı sohbette yoktur emsali. Merhamet ve metanette eşi bulunmayan. Tayyi mekanda sınır tanımayan. Hasrette Yakub’a Cemalde Yusuf’a Izdırap ve meşakkatte Eyyub’a emsal. Üveysiyül mürşidan. Eşşeyh es seyyid Abdurrahim er-erzincani. (Kuddise sırrihu)\n\n" +
                "Ve ilâ ervâhi küllin mines sâdâti vel hulefâi vel mürîdîne vel muhibfaîne vel mensûbîne vel müntesibîne ilâ hâzihit tarîkatil aliyyeti ve sâirit turuk. Allâhümmektüb misle sevâbıhâ fi sâhifeti amali küllin, verfa bihâ derecâti küllin, ve âli fî âlâil illiyyîne menzilete küllin ve zidnâ muhabbete inde cenabı küllin, ve efid aleynâ min berekâti küllin ve etmim lenâ sülûke, hâzihit tarîkatil aliyyeh ve veffiknâ li merdâti şeyhinâ ve imtisâli evâmirihi ve içtinâbı menâhihi verzuknal bekâe bike badel fenâi fike âlâ kademi sâdâtines sâlikine fihâ. Allâhümmağfırlenâ hatâyânâ veclübnâ ilâ muhabbetike bi muhabbeti evliyâike verzuknat tevfîka vel istikâmete âlâ dinike ve taâtike bi rahmetike yâ erhamerrâhimîn. Âmin, âmin vel hamdu lillâhi rabbil âlemîn...\n\n"+
                "KÜÇÜK SİLSİLE-İ ŞERİF \n" +
                "Nebi, Sıddıku Selman, Kasım estü Caferi Tayfur Ki badez bul Hasan şud bu Aliyyü Yusuf est gencur Zi Abdulhâlik âmed Ârifü Mahmud râ behre Ki zişan şud diyarı Mâverâünnehri kûhi Tur Ali, Baba, Külâlü Nakşibend estü Alâeddin Pes ez Yakubu Cerhi, Hâcei Ahrarı şud meşhur Muhammed Zâhidu Derviş Muhammed, Hâcegî, Bakî Müceddid, ürvetül Vüskâ vü Seyfeddinü Seyyid Nur Habibullahi Mazhar, şahı Abdullahı mevlânâ Ki zişan reşki subhi iyd şud mârâ şebideycur Ziyâüddin vahîdud dehri mevlânâi mâ Halid Çu âmed kâniten lillâhi yâ zel feyzi yâzennur. Pes işan Seyyidi Tâhâ vü Seyyid Sıbgatullahi Şahı ma Abdurrahman ezü şud dü cihan memur Muhammed Samiyi gawâsi bahri aşkı râ her dem teşâdetkânı bol himmet şude ez her cihet mamur Muhammed Beşirûl hadim ki an dergâhı Sami'de Reside babı ulyâya şude ez her cihet mamur Zî feyzi pür Beşir âmed safâyı kalbi insana Emsali Musa İmrâni Dede nâmı diğer mestur. Evladı Muhammed Sami Varisi Musa Bayburdî oldur gönüller sultanı Abdurrahim Erzincani. (Kuddise sırrihu)";
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayi = (EditText) findViewById(R.id.sayi);
        hatme = (TextView) findViewById(R.id.hatme);
        hesapla = (Button) findViewById(R.id.hesapla);
        temizle = (Button) findViewById(R.id.temizle);


        hesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    sayi.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    int sayi1=Integer.parseInt(sayi.getText().toString());
                    if(sayi1>0){
                    int snc1=100/sayi1;
                    int snc2=100-sayi1*snc1;
                    int snc3=snc1+1;
                    int snc4=sayi1-snc2;
                        int elem1=79/sayi1;
                        int elem2=79-sayi1*elem1;
                        int elem3=elem1+1;
                        int elem4=sayi1-elem2;

                if (snc2 == 0 && sayi1>14 && sayi1<101) {

                    hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(elem2)+" kişi "+String.valueOf(elem3)+", "+String.valueOf(elem4)+" kişi "+String.valueOf(elem1)+" taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                    +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " +String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n" + buyukhatme());}

                    if (sayi1 == 1) {
                    hatme.setText("Zımmi hatme yapabilirsiniz.\n"); }

                if (!(snc2 == 0) && sayi1>14 && sayi1<79) {

                    hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(elem2)+" kişi "+String.valueOf(elem3)+", "+String.valueOf(elem4)+" kişi "+String.valueOf(elem1)+" taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                    +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(snc2)+" kişi "+String.valueOf(snc3)+", "+String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n"+buyukhatme());
              }

                        if (sayi1 == 79) {
                            hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 79 kişi 1 taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                            +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(snc2)+" kişi "+String.valueOf(snc3)+", "+String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n"+buyukhatme());
                        }
                        if (sayi1>79 && sayi1<100) {

                            hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 79 kişi 1 taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                            +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(snc2)+" kişi "+String.valueOf(snc3)+", "+String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n"+buyukhatme());
                        }
                        if (sayi1 == 100) {
                            hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 79 kişi 1 taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                            +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 100 kişi 1 taş alacak şekilde dağıtılır.\n\n"+buyukhatme());
                        }
                if (sayi1 > 100 ) {


                    hatme.setText("İnşirah suresi için Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 79 kişi 1 taş alır."+" İnşirah suresini bilmeyenler adedince kalan taşlar eşit şekilde bilenlere dağıtılır."
                    +"\n\nİhlas suresi için kalan 21 taş İnşirah bilmeyenlere eşit şekilde, bilmeyen yoksa Hatmeyi okuyandan itibaren sağ taraftan " + "İlk 100 kişi 1 taş alacak şekilde dağıtılır.\n\n"+buyukhatme());

                }
                if (sayi1 > 1 && sayi1 < 15) {
                     if(snc2 == 0){
                         hatme.setText("Hatmeyi okuyandan itibaren sağ taraftan " +String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n"+kucukhatme());

                     }
                    if(!((snc2) == 0)){
                        hatme.setText("Hatmeyi okuyandan itibaren sağ taraftan " + String.valueOf(snc2)+" kişi "+String.valueOf(snc3)+", "+String.valueOf(snc4)+" kişi "+String.valueOf(snc1)+" taş alacak şekilde dağıtılır.\n\n"+kucukhatme());

                    }
                }

                    }
                    else {
                        sayi.setText("");
                        hatme.setText("Lütfen bir sayı giriniz.\n");
                        }
                    }

            }
        );
        temizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sayi.setText("");
                hatme.setText("");
            }
        });


    }

    public void exit(View view) {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}