/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyboolean;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseEmptyCallback;
import com.squareup.okhttp.ResponseBody;
import retrofit.Retrofit;
import retrofit.Call;
import retrofit.Response;
import fixtures.bodyboolean.models.Error;

public class BoolImpl implements Bool {
    private BoolService service;
    AutoRestBoolTestService client;

    public BoolImpl(Retrofit retrofit, AutoRestBoolTestService client) {
        this.service = retrofit.create(BoolService.class);
        this.client = client;
    }

    /**
     * Get true Boolean value
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Boolean getTrue() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getTrue();
            ServiceResponse<Boolean> response = getTrueDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get true Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getTrueAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getTrue();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getTrueDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getTrueDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putTrue(boolean boolBody) throws ServiceException {
        try {
            Call<ResponseBody> call = service.putTrue(boolBody);
            ServiceResponse<Void> response = putTrueDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Set Boolean value true
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putTrueAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putTrue(boolBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putTrueDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putTrueDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get false Boolean value
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Boolean getFalse() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getFalse();
            ServiceResponse<Boolean> response = getFalseDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get false Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getFalseAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getFalse();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getFalseDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getFalseDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public void putFalse(boolean boolBody) throws ServiceException {
        try {
            Call<ResponseBody> call = service.putFalse(boolBody);
            ServiceResponse<Void> response = putFalseDelegate(call.execute(), null);
            response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Set Boolean value false
     *
     * @param boolBody the boolean value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> putFalseAsync(boolean boolBody, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.putFalse(boolBody);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(putFalseDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Void> putFalseDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Void>()
                .register(200, new TypeToken<Void>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get null Boolean value
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Boolean getNull() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getNull();
            ServiceResponse<Boolean> response = getNullDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get null Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getNullAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getNull();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getNullDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getNullDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

    /**
     * Get invalid Boolean value
     *
     * @return the Boolean object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    public Boolean getInvalid() throws ServiceException {
        try {
            Call<ResponseBody> call = service.getInvalid();
            ServiceResponse<Boolean> response = getInvalidDelegate(call.execute(), null);
            return response.getBody();
        } catch (ServiceException ex) {
            throw ex;
        } catch (Exception ex) {
            throw new ServiceException(ex);
        }
    }

    /**
     * Get invalid Boolean value
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    public Call<ResponseBody> getInvalidAsync(final ServiceCallback<Boolean> serviceCallback) {
        Call<ResponseBody> call = service.getInvalid();
        call.enqueue(new ServiceResponseCallback<Boolean>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(getInvalidDelegate(response, retrofit));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<Boolean> getInvalidDelegate(Response<ResponseBody> response, Retrofit retrofit) throws ServiceException {
        return new ServiceResponseBuilder<Boolean>()
                .register(200, new TypeToken<Boolean>(){}.getType())
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, retrofit);
    }

}
