package maas.bcap.module.ac.ac02.sac02f452r;

import jakarta.servlet.http.HttpServletRequest;
import maas.bcap.az.ServiceSupport;
import mti.com.telegram.exception.TelegramNestedRuntimeException;
import mti.com.telegram.vo.TelegramUserDataInput;
import mti.com.telegram.vo.TelegramUserDataOutput;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SAC02F452R {
    private static final Logger logger = LogManager.getLogger(SAC02F452R.class);

    @Autowired
    private ServiceSupport support;

    public TelegramUserDataOutput<SAC02F452ROutVo> call(HttpServletRequest request, SAC02F452RInVo inVo, String screenId) {
        TelegramUserDataOutput<SAC02F452ROutVo> result = TelegramUserDataOutput.<SAC02F452ROutVo>builder().build();
        SAC02F452ROutVo outVo = SAC02F452ROutVo.builder().build();

        try {
            TelegramUserDataInput userDataInput = support.tuxedoHeader(request, this.getClass().getSimpleName(), screenId);
            result = support.tuxedoTransaction(userDataInput, inVo, outVo);
//            String response = "00002606devaps01202410011538270184232500SAC02F452R              MTI R                        devaps0120241001153827018423250020241001153826958   UNIT      192.168.0.133                   0CDD2494CF5F                           020241001153826958   20241001153845351600  0  00        000       NAZAP0001                                                        EN                                                                                                                                             N00000425                     30inquiry process success.                                                                                                                                                                                                                                                                                                                                                                                        00D00001669                             96      1020240101202401054259450300373427   6451380000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N20240102202401035379408870000145   1113100000000000000006000000000000000000000015    00000000000000006000000000000000000000000000000000000000000000000000000000000N20240105202401094215708100006338   0000890000000000000115000000000000000000000005    00000000000000105000000000000000000000000000000000000000000000000000000000000 20240108202401094215708100041160   2693760000000000000020000000000000000000000005    00000000000000020000000000000000000000000000000000000000000000000000000000000N20240108202401094215708100041160   2536030000000000000025000000000000000000000005    00000000000000025000000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129930000000000000006535000000000000000000005    00000000000000006535000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129920000000000000002305000000000000000000005    00000000000000002305000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111510000000000000006250000000000000000000005    00000000000000006250000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111500000000000000003200000000000000000000005    00000000000000003200000000000000000000000000000000000000000000000000000000000N20240227202402294485580000080033   1112060000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N@@";
//            result = InterfaceTelegramTest.testCall(inputUserData, inVo, outVo, response);
        } catch (TelegramNestedRuntimeException e) {
            logger.info(e.toString());
            logger.info(e.getMsg());
        } catch (Exception e) {
            logger.info(e.toString());
            logger.info(e.getClass());
            logger.info(e.getLocalizedMessage());
            logger.info(e.getMessage());
        }

        return result;
    }
}

//Example Request
//SAC02F452RInVo sac02F452RInVo = SAC02F452RInVo.builder()
//        .page_no(1)
//        .page_size(10)
//        .mid("71000204442")
//        .auth_strt_date("20240101")
//        .auth_end_date("20240919")
//        .build();

//Request
//00000583                                SAC02F452R              MTI S                                                                            UNIT      192.168.0.133                   0CDD2494CF5F                           020241001153826958                         00000      00000                                                                        EN                                                                                                                                              00000000                     00000100001071000204442      2024010120240919

//Response
//00002606devaps01202410011538270184232500SAC02F452R              MTI R                        devaps0120241001153827018423250020241001153826958   UNIT      192.168.0.133                   0CDD2494CF5F                           020241001153826958   20241001153845351600  0  00        000       NAZAP0001                                                        EN                                                                                                                                             N00000425                     30inquiry process success.                                                                                                                                                                                                                                                                                                                                                                                         0D00001669                             96      1020240101202401054259450300373427   6451380000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N20240102202401035379408870000145   1113100000000000000006000000000000000000000015    00000000000000006000000000000000000000000000000000000000000000000000000000000N20240105202401094215708100006338   0000890000000000000115000000000000000000000005    00000000000000105000000000000000000000000000000000000000000000000000000000000 20240108202401094215708100041160   2693760000000000000020000000000000000000000005    00000000000000020000000000000000000000000000000000000000000000000000000000000N20240108202401094215708100041160   2536030000000000000025000000000000000000000005    00000000000000025000000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129930000000000000006535000000000000000000005    00000000000000006535000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129920000000000000002305000000000000000000005    00000000000000002305000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111510000000000000006250000000000000000000005    00000000000000006250000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111500000000000000003200000000000000000000005    00000000000000003200000000000000000000000000000000000000000000000000000000000N20240227202402294485580000080033   1112060000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N@@
//Response Edited
//00002606devaps01202410011538270184232500SAC02F452R              MTI R                        devaps0120241001153827018423250020241001153826958   UNIT      192.168.0.133                   0CDD2494CF5F                           020241001153826958   20241001153845351600  0  00        000       NAZAP0001                                                        EN                                                                                                                                             N00000425                     30inquiry process success.                                                                                                                                                                                                                                                                                                                                                                                        00D00001669                             96      1020240101202401054259450300373427   6451380000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N20240102202401035379408870000145   1113100000000000000006000000000000000000000015    00000000000000006000000000000000000000000000000000000000000000000000000000000N20240105202401094215708100006338   0000890000000000000115000000000000000000000005    00000000000000105000000000000000000000000000000000000000000000000000000000000 20240108202401094215708100041160   2693760000000000000020000000000000000000000005    00000000000000020000000000000000000000000000000000000000000000000000000000000N20240108202401094215708100041160   2536030000000000000025000000000000000000000005    00000000000000025000000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129930000000000000006535000000000000000000005    00000000000000006535000000000000000000000000000000000000000000000000000000000N20240221202402224485580000080033   1129920000000000000002305000000000000000000005    00000000000000002305000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111510000000000000006250000000000000000000005    00000000000000006250000000000000000000000000000000000000000000000000000000000N20240223202402254485580000080033   1111500000000000000003200000000000000000000005    00000000000000003200000000000000000000000000000000000000000000000000000000000N20240227202402294485580000080033   1112060000000000000006589000000000000000000005    00000000000000006589000000000000000000000000000000000000000000000000000000000N@@