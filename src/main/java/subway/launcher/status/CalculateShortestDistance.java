package subway.launcher.status;

import subway.domain.weight.WeightCode;
import subway.launcher.context.SystemContext;
import subway.launcher.status.BasicStatus;
import subway.view.InputView;
import subway.view.OutputView;

public class CalculateShortestDistance implements BasicStatus {

    @Override
    public BasicStatus next(SystemContext context, InputView inputView, OutputView outputView) {
        var result = context.calculateShortestDistance(WeightCode.DISTANCE);
        outputView.printResult(result);
        return new SelectMainMenuStatus();
    }

    @Override
    public boolean runnable() {
        return true;
    }
}
