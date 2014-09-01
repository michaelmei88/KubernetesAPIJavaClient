/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.apache.stratos.kubernetes.api.client.interfaces;

import org.apache.stratos.kubernetes.api.exceptions.KubernetesClientException;
import org.apache.stratos.kubernetes.api.model.Pod;

public interface KubernetesAPIClientInterface {

	/**
	 * Get information of a Pod given the PodID
	 * @param podId id of the pod
	 * @return {@link Pod}
	 * @throws KubernetesClientException
	 */
	public Pod getPod(String podId) throws KubernetesClientException;
	
	/**
	 * Get all Pods
	 * @return Pods
	 * @throws KubernetesClientException
	 */
	public Pod[] getAllPods() throws KubernetesClientException;
	
	/**
	 * Create a new Pod
	 * @param pod Pod to be created
	 * @throws KubernetesClientException
	 */
	public void createPod(Pod pod) throws KubernetesClientException;
	
	/**
	 * Delete a Pod
	 * @param podId Id of the Pod to be deleted
	 * @throws KubernetesClientException
	 */
	public void deletePod(String podId) throws KubernetesClientException;
}
