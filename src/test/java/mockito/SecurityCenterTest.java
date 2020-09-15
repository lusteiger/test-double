package mockito;



import mock.DoorPanel;
import mock.SecurityCenter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;


@ExtendWith(MockitoExtension.class)
public class SecurityCenterTest {
    @Mock
    private DoorPanel mockDoorPanel;
    @InjectMocks
    private SecurityCenter securityCenter;

    @Test
    private void shouldVerifyDoorIsClosed(){
        securityCenter.switchOn();

        verify(mockDoorPanel,times(1)).close();
    }


}
